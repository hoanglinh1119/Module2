package Arrays.Exception;


import java.util.Scanner;
public class ArrayIndexMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap so ban muon tim ");
        int number=scanner.nextInt();
        ArrayIndex arrayIndex=new ArrayIndex();
         Integer[] arr=arrayIndex.createRandom();
        try {
            System.out.println("");
            System.out.println("gia tri cua number la "+number+" vi tri "+arr[number]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("bi loi "+e.getMessage());
        }
    }

}
