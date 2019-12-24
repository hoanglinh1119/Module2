package com.company;

import java.util.Scanner;

public class chainPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of chain prime:");
        int number = sc.nextInt();
        int count = 0; int i=2;
        while (count <= number) {
               if (songuyento(i)) {
                   System.out.println(i);
                   count+=1;
               }
               i++;

        }
    }
    public static boolean songuyento(int num){
        for (int j=2;j<=Math.sqrt(num);j++){
            if(num%j==0){
                return  false;
            }
        }
        return true;
    }
}
