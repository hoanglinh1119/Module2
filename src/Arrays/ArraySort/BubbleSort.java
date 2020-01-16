package Arrays.ArraySort;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("day so cua ban co bao nhieu phan tu: ");
        int lengOfString=input.nextInt();
        input.nextLine();
        int[] arrayIntString=new int[lengOfString];
        int i=0;
        while (i<lengOfString) {
            System.out.println("vui long nhap so thu " + (i + 1) + ":");
            arrayIntString[i] = input.nextInt();
            i++;
        }
        sortBubble(arrayIntString);

    }
    public static void sortBubble(int[] arr){
        for(int i=0;i<arr.length;i++){
            int temp;
            for (int j=0;j<arr.length-i-1;j++){
                if(arr[j+1]<arr[j]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }

            }
            for (int j=0;j<arr.length;j++){
            System.out.print(arr[j]);}
            System.out.println("------");

        }
       for (int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
       }
    }
}
