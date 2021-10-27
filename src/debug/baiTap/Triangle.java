package debug.baiTap;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhập x");
        int x=scanner.nextInt();
        System.out.println("nhập y");
        int y=scanner.nextInt();
        System.out.println("nhập z");
        int z=scanner.nextInt();
        Triangle triangle=new Triangle();
        triangle.getTriangle(x,y,z);

    }
    public void getTriangle(int x,int y,int z){
        try{

            if(x<=0||y<=0||z<=0||x+y<z||x+z<y||y+z<x){
                throw new IllegalTriangleException();
            }else System.out.println("là 1 tam giác có 3 cạnh là " +x +"   "+y+ "    "+z);

        }catch (IllegalTriangleException e){
            e.triangleCondition();
        }
    }
}
class  IllegalTriangleException extends RuntimeException {


    public void triangleCondition(){
        System.err.println("lỗi tam giác ");
    }
}
