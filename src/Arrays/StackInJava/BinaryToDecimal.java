package Arrays.StackInJava;

import java.util.Scanner;
import java.util.Stack;
import java.util.EmptyStackException;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number Decimal");
        String number = scanner.nextLine();
        int count=0;
        int Decimal = 0;
        int[] binary = new int[number.length()];
        for (int i = 0; i < number.length(); i++) {
            binary[i]=Integer.parseInt(String.valueOf(number.charAt(i)));
             count++;
        }
        for (int i=0;i<=count;i++){
            Decimal+=binary[i]*Math.pow(2,count-1);
            count--;
        }
        System.out.println(Decimal);
    }
}