package com.company;

import java.util.Scanner;

public class hien_thi_hinh {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("menu");
        System.out.println("1.hinh chu nhat");
        System.out.println("2.hinh tam giac vuong tren");
        System.out.println("3.hinh tam giac vuong duoi");
        System.out.println("4.hinh tam giac can");
        System.out.println("Enter your choice:");
        int choice=scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("**********");
                System.out.println("**********");
                System.out.println("**********");
                System.out.println("**********");
                break;
            case 2:
                System.out.println("*********");
                System.out.println("*******");
                System.out.println("*****");
                System.out.println("***");
                System.out.println("*");
                break;
            case 3:
                System.out.println("*");
                System.out.println("***");
                System.out.println("*****");
                System.out.println("*******");
                System.out.println("*********");
                break;
            case 4:
                System.out.println("    *");
                System.out.println("   ***");
                System.out.println("  *****");
                System.out.println(" *******");
                System.out.println("*********");
                break;
            default:
                System.out.println("No choice!!!");

        }

    }
}
