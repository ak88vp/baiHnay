package debug;

import java.util.Scanner;

public class adad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = -1 ;
        while (x <= 0 || 5 <= x){
            try{
                do{
                    System.out.println("Nhập vào X: ");
                    x = sc.nextInt();
                    if(0 <= x && x <= 5){
                        System.out.println("Giá trị của X là: " + x);
                    }
                } while (x < 0 || x > 5);
            } catch (Exception e){
                sc.nextLine();
            }
        }
    }
}
