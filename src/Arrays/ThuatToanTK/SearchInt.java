package Arrays.ThuatToanTK;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInt {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap do dai chuoi so cua ban ");
        int lengthInt=scanner.nextInt();
        scanner.nextLine();
        int[] arrayList=new int[lengthInt];
        for (int i=0;i<arrayList.length;i++){
            System.out.println("nhap so thu "+(i+1)+":");
            arrayList[i]=scanner.nextInt();
        }
        System.out.println("nhap so ban muon tim : ");
        int value=scanner.nextInt();
        scanner.nextLine();
        sortArrays(arrayList);
       if(binarySearch(0,arrayList.length-1,arrayList,value)){
           System.out.println("tim thay");
       } else {
           System.out.println("khong tim thay");
       }
    }
    public static void sortArrays(int[] arr){
        int temp;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
    }
    public static boolean binarySearch(int low,int hight,int[] arr,int value ){
       int mid=(hight+low)/2;
       if (hight>low){
        if(arr[mid]==value){
           return true;
        }else if (value>arr[mid]){
            binarySearch(mid+1,hight,arr,value);
        }else {
            binarySearch(low,mid-1,arr,value);
        }

    }
       return false;
    }
}
