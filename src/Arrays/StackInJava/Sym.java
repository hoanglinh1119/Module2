package Arrays.StackInJava;

import java.util.Scanner;
import java.util.Stack;

public class Sym {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chuoi muon kiem tra dau ngoac");
        String inputString = scanner.nextLine();
        char[] string = new char[inputString.length()];
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            string[i] = inputString.charAt(i);
            count++;
        }
        Stack<Character> strings = new Stack<Character>();
        for (int i = 0; i < count; i++) {
            if (string[i] == ')' || string[i] == '(') ;
            strings.push(string[i]);
            break;
        }
        if (strings.pop() == ')') {
            System.out.println("khong hop le ");
        } else {
            for (int i = 0; i < count; i++) {
                if (string[i] == '(') {
                    strings.push(string[i]);
                }
            }
            for (int i = 0; i < count; i++) {
                if (string[i] == ')'){
                    strings.pop();}
            }
            if (!strings.empty()) {
                System.out.println("khong hop le");
            } else {
                System.out.println(" hop le");
            }
        }
    }
}
