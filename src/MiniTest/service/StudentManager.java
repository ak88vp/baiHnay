package MiniTest.service;

import MiniTest.model.Student;

import java.util.ArrayList;

public class StudentManager implements Manager<Student> {
    ArrayList<Student> listStudent = new ArrayList<>();

    public StudentManager(ArrayList<Student> listStudent) {
        this.listStudent = listStudent;
    }

    public StudentManager() {
    }

    public ArrayList<Student> getListStudent() {
        return listStudent;
    }

    public void setListStudent(ArrayList<Student> listStudent) {
        this.listStudent = listStudent;
    }

    @Override
    public void add(Student student) {
        listStudent.add(student);
    }

    @Override
    public void print() {
        for (Student student : listStudent) {
            System.out.println(student);
        }
    }

    @Override
    public int find(int id) {
        int index = -1;
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getId() == id) {
                index = i;
                System.out.println("Tên của học sinh bạn tìm là " + listStudent.get(i).getName());
                return index;
            }
        }
        System.out.println("Không tìm thấy học sinh này ");
        return index;
    }

    @Override
    public void delete(int id) {
        listStudent.remove(find(id));
    }

    @Override
    public void edit(int id, Student student) {
        listStudent.set(find(id),student);
    }

    @Override
    public void sort() {
        listStudent.sort((a,b)-> (int) (a.getMediumScore()- b.getMediumScore()));
        print();
    }
    public void highestScore(){
        double max=listStudent.get(0).getChemistryScores();
        int index=0;
        for (int i = 0; i < listStudent.size(); i++) {
            if(max<listStudent.get(i).getMediumScore()){
                max=listStudent.get(i).getMediumScore();
                index=i;
            }
        }
        System.out.println("học sinh có điểm trung bình cao nhất là : " +listStudent.get(index).getName()+
                "có số điểm là " +listStudent.get(index).getMediumScore());


    }



}
