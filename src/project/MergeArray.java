package project;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int[] array1=new int[7];
        int[] array2=new int[7];
        int[] array3=new int[14];
        int i,j,k;
        Scanner scanner=new Scanner(System.in);
        for ( i=0;i<array1.length;i++){
            System.out.print("input value of index for array1 "+(i+1)+":");
            array1[i]=scanner.nextInt();
        }
        for ( j=0;j<array2.length;j++){
            System.out.print("Input value of index for array2: "+(j+1)+":");
            array2[j]=scanner.nextInt();
        }
        System.out.printf("%-14%s%s","array 3: ","");
        for ( i=0;i<array1.length;i++){
            k=i;
            array3[k]=array1[i];
            System.out.print(array3[k]+"\t");
        }
        for ( j=0;j<array2.length;j++){
            k=j;
            array3[array1.length+k]=array2[j];
            System.out.print(array3[array1.length+k]+"\t");
        }

    }
}
