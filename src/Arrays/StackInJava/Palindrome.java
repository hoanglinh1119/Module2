package Arrays.StackInJava;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap chuoi cua ban vao: ");
        String chuoi=scanner.nextLine();
        int count=0;
        char[] strings=new char[chuoi.length()];
        for (int i=0;i<chuoi.length();i++){
            strings[i]=chuoi.charAt(i);
            count++;
        }
        Stack<Character> islandString=new Stack<Character>();

        for (int i=0;i<count;i++){
            islandString.push(strings[i]);
        }
        for (int i=0;i<count;i++){
            islandString.pop();
        }
        Queue<Character> island=new LinkedList<>();

    }
}
