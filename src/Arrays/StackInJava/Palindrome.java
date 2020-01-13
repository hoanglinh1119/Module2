package Arrays.StackInJava;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap chuoi cua ban vao: ");
        String input=scanner.nextLine();
        int count=0;
        char[] strings=new char[input.length()];
        for (int i=0;i<input.length();i++){
            strings[i]=input.charAt(i);
            count++;
        }
        Stack<Character> islandString=new Stack<Character>();

        for (int i=0;i<count;i++){
            islandString.push(strings[i]);
        }
        char[] islandStrig=new char[count];
        for (int i=0;i<count;i++){
            islandStrig[i]=islandString.pop();
        }
        Queue<Character> island=new LinkedList<>();
        for (int i = 0; i<count; i++){
            island.add(strings[i]);
        }
        char[] notIsland=new char[count];
        for (int i=0;i<count;i++){
            notIsland[i]=island.poll();
        }
        boolean isPalindrome=true;
        for (int i=0;i<count;i++){
            if(islandStrig[i]!=notIsland[i]){
                isPalindrome=false;
                break;
            }
        }
        if (isPalindrome){
            System.out.println("The string is a palindrome");
        }else {
            System.out.println("The string is not a palindrome");
        }
    }
}
