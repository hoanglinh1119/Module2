package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAccount {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String accountRegex="^[_a-z0-9]{6,10}$";

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();

        pattern=Pattern.compile(accountRegex);
        matcher=pattern.matcher(input);
        if(matcher.find()){
            System.out.println("ok");
        }else System.out.println("vui long kiem tra lai");

    }
}
