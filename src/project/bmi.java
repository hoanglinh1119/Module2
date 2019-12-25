package project;

import java.util.Scanner;

public class bmi {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        double weight,height,bmi;
        System.out.print("your weight(in kilogam):");
        weight=scanner.nextDouble();
        System.out.print("your height(in metter):");
        height=scanner.nextDouble();
        bmi=weight/Math.pow(height,2);
        if(bmi<18.5)
            System.out.printf("%f%s",bmi,"under weight");
        else if(bmi<25.0)
            System.out.printf("%f%s",bmi,"Normal");
        else if(bmi<30.0)
            System.out.printf("%f%s",bmi,"over weight");
        else System.out.printf("%f%s",bmi,"obese");
    }
}
