package com.company;

import java.util.Scanner;

public class hello {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a name:");
        String name=scanner.nextLine();
        System.out.println(" hello " +name);
    }
}
