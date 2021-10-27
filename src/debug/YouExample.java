package debug;

import java.util.InputMismatchException;
import java.util.Scanner;

public class YouExample extends Throwable {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=-2;
        while (x>5||x<-1){
            try {
                System.out.println("nhập x :");
                x=scanner.nextInt();
            } catch (InputMismatchException inputMismatchException){
                scanner.nextLine();
                System.out.println("nhập vào số ");
            }
        }
    }


}
