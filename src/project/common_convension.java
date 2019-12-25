package project;

import java.util.Scanner;

public class common_convension {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=scanner.nextInt();
        a=Math.abs(a);
        System.out.print("Enter b:");
        int b=scanner.nextInt();
        b=Math.abs(b);
        if (a==0||b==0){
            System.out.println("No common version");

        }
        while (a!=b){
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        System.out.println("common version:"+a);
    }
}
