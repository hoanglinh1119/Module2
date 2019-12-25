package project;

import java.util.Scanner;

public class reverseArray {
    public static void main(String[]args){
        int size;
        int[] array;
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.println("Enter a size:");
            size= scanner.nextInt();
            if(size>20){
                System.out.println("Size does not exceed 20");
            }
        }while (size>20);
        array=new int[size];
        int i=0;
        while (i<array.length){
                System.out.println("Enter element "+ (i+1)+":");
                array[i]=scanner.nextInt();
                i++;
        }

        System.out.printf("%-20s%s","element array:","" );
        for (int j=0;j<array.length;j++){
            System.out.print(array[j]+"\t");
        }
        for (int j=0;j<array.length/2;j++){
            int temp=array[j];
            array[j]=array[size-j-1];
            array[size-j-1]=temp;
        }
        System.out.printf("%-20s%s","reverse Array :","");
        for (int j=0;j<array.length;j++){
            System.out.print(array[j]+"\t");
        }
    }
}
