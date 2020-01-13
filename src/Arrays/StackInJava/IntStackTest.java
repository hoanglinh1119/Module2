package Arrays.StackInJava;

import java.util.Scanner;

public class IntStackTest {
    public static void main(String[] args) throws Exception{
        Scanner scanner=new Scanner(System.in);
        System.out.println(" nhap do dai chuoi cua ban");
        int length=scanner.nextInt();
        IntStack intStack=new IntStack(length);
        for (int i=0;i<length;i++){
            System.out.println("nhap so thu "+(i+1)+":");
            intStack.push(scanner.nextInt());
        }
        System.out.println("Mang lay ra sau khi dua vao stack la: ");
        for (int i=0;i<length;i++){
            System.out.println(intStack.pop());
        }
    }
}
