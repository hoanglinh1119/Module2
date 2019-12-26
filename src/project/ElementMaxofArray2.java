package project;

import java.util.Scanner;

public class ElementMaxofArray2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap so hang cua ma tran: ");
        int hang=scanner.nextInt();
        System.out.println("nhap so cot cho moi hang:");
        int cot=scanner.nextInt();
        int[][] array= new int[hang][cot];
        for (int i=0;i<hang;i++){
            for (int j=0;j<cot;j++){
                System.out.println("nhap gia tri hang"+(i+1)+"cot"+(j+1));
                array[i][j]=scanner.nextInt();
            }
        }
        int i,j;
        int max=array[0][0];
        for (i=0;i<array.length;i++){
            for (j=0;j<array[i].length;j++){
                if (array[i][j]>max){
                    max=array[i][j];
                }
            }
        }
        System.out.println("Max :" +max);
    }
}
