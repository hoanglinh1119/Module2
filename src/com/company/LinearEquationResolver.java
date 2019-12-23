package com.company;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("nhap gia tri cua a:");
        double a=scanner.nextDouble();
        System.out.print("nhap gia tri cua b:");
        double b = scanner.nextDouble();
        System.out.print("nhap gia tri cua c :");
        double c=scanner.nextDouble();

        if(a!=0){
            double Equation=(c-b)/a;
            System.out.println("nghiem cua phuong trinh la:"+Equation);
        }else if (b==0){
            System.out.println("Phuong trinh co vo so nghiem");
        } else {
            System.out.println("phuong trinh vo nghiem");
        }
    }
}
