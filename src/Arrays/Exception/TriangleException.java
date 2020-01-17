package Arrays.Exception;


import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleException {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
           try {
               System.out.println("Nhap canh thu 1 : ");

            int canh1 = input.nextInt();
            System.out.println("nhap canh thu 2 : ");
            int canh2 = input.nextInt();
            System.out.println("nhap canh thu 3 : ");
            int canh3 = input.nextInt();
            Triangle triangle=new Triangle();
            triangle.xetbacanh(canh1,canh2,canh3);
           }catch (InputMismatchException e){
               System.out.println("vui long nhap du lieu kieu so nguyen " +e);
           }
    }
}
