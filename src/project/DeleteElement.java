package project;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int[] array={1,2,4,6,9,8,3,7,0,5};
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter index want to delete:");
        int index=scanner.nextInt();
        System.out.printf("%-10%s%s","Array after delete:","");
        for (int i=0;i<array.length-1;i++){
            if (i>=index-1 ){
            array[i]=array[i+1];
            System.out.print(array[i]+"\t");
            }else {
                System.out.print(array[i]+"\t");
            }
        }

    }
}
