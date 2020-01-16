package Arrays.ArraySort;

import java.util.Scanner;

public class SortInsert {
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
        sortInsert(arrayIntString);
    }
    public static void sortInsert(int[] arrayInt){

        int current;
        for (int j=0;j<arrayInt.length;j++){
            for (int k=0;k<arrayInt.length;k++){
                if(arrayInt[j]<arrayInt[k]){
                    current=arrayInt[j];
                    arrayInt[j]=arrayInt[k];
                    arrayInt[k]=current;
                }
            }
        }
        for (int i=0;i<arrayInt.length;i++){
            System.out.print(arrayInt[i]);
        }
    }
}
