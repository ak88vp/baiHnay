package MiniTest.service;

import MiniTest.model.Student;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        StudentManager studentManager=new StudentManager();
        Scanner scanner=new Scanner(System.in);
        int choice;
        do {
            System.out.println("+_+_+_+_+_+_+_+_+_Menu_+_+_+_+_+_+_+_+_+");
            System.out.println(" 1 : Thêm học sinh ");
            System.out.println(" 2 : Tìm kiếm  ");
            System.out.println(" 3 : Xóa  ");
            System.out.println(" 4 : Sửa ");
            System.out.println(" 5 : Hiển thị danh sách ");
            System.out.println(" 6 : Sắp xếp học sinh theo điểm ");
            System.out.println(" 7 : Học sinh có điểm cao nhất ");
            System.out.println(" 0 : kết thúc ");
            choice=scanner.nextInt();
            if(choice<8&&choice>0){
                switch (choice){
                    case 1:
                        scanner.nextLine();
                        System.out.println("Nhập Tên ");
                        String name=scanner.nextLine();
                        System.out.println("Nhập tuổi");
                        String age =scanner.nextLine();
                        System.out.println("Nhập điểm toán");

                        double mathScores=scanner.nextDouble();
                        System.out.println("Nhập điểm lý");
                        double physicsScores=scanner.nextDouble();
                        System.out.println("Nhập điểm hóa");
                        double chemistryScores=scanner.nextDouble();
                        Student student= new Student(name,age,mathScores,physicsScores,chemistryScores);
                        studentManager.add(student);
                        break;
                    case 2:
                        System.out.println("Nhập id muốn tìm : ");
                        int idWantToFind=scanner.nextInt();
                        studentManager.find(idWantToFind);
                        if (studentManager.find(idWantToFind)!=-1){
                            System.out.println("Học sinh bạn muốn tìm có thông tin là : " +studentManager.listStudent.get(studentManager.find(idWantToFind)));
                        }
                        break;
                    case 3:
                        System.out.println("Nhập id muốn xóa");
                        int idWantToDelete=scanner.nextInt();
                        studentManager.delete(idWantToDelete);
                        break;
                    case 4:
                        System.out.println("");
                        break;
                    case 5:
                        studentManager.print();
                        break;
                    case 6:
                        studentManager.sort();
                        break;
                    case 7:
                        studentManager.highestScore();
                        break;
                }

            }else if(choice<0||choice>7){
                System.out.println("chưa phát triển");
            }else System.out.println("End");

        }while (choice !=0);
    }
}
