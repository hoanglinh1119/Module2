package Arrays.StackInJava;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number Decimal");
        int number=scanner.nextInt();
        int count=0;
        Stack<Integer> DecimalToBinary=new Stack<>();
        while (number!=0){
            int a;
            a=number%2;
            number=number/2;
            DecimalToBinary.push(a);
            count++;
        }
        int[] binary=new int[count];
        for (int i=0;i<binary.length;i++){
            binary[i]=DecimalToBinary.pop();
            System.out.println(binary[i]);
        }
    }
}
