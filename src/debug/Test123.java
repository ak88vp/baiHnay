package debug;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test123 {
    public static void main(String[] args) {
        int input=99 ;
       while (input>5||input<0){
           Scanner scanner=new Scanner(System.in);
           try{
               System.out.println("nhập vào 1 số ");
               input=scanner.nextInt();
               if(0<input&&input<6){
                   System.out.println(" x = " +input);
               }else {
                   System.out.println(" nhập đoạn từ 0 đến 5 thui");
               }
           } catch (InputMismatchException e){
               System.out.println(" nhập số thôi ");
           }

       }
    }
}



