package project;

import java.util.Scanner;

public class Usd {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        long usd,vnd,tigia;
        tigia=23000;
        System.out.print("nhap so tien usd vao:");
        usd=scanner.nextLong();
        vnd=usd*tigia;
        System.out.print("so tien vnd la:"+vnd);

    }
}
