package MiniTest.service;

import MiniTest.model.Student;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager=new StudentManager();
        Student student1=new Student(1,"AK88","18",8,8,8);
        Student student2=new Student(2,"AK99","18",7,7,7);
        Student student3=new Student(3,"AK00","18",6,6,6);
        Student student5=new Student(3,"AK11111","18",6,6,6);
        studentManager.add(student1);
        studentManager.add(student2);
        studentManager.add(student3);
        studentManager.print();
        studentManager.find(3);
        studentManager.delete(3);
        studentManager.print();
        studentManager.edit(2,student5);
        studentManager.print();
        studentManager.sort();
        System.out.println("sau sắp xếp");
        studentManager.print();
        studentManager.highestScore();
    }
}
