package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String emailRegex="^[a-zA-Z]+[a-zA-Z0-9]*@+gmail.com|yahoo.com|hotmail.com$";
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        pattern=Pattern.compile(emailRegex);
        matcher=pattern.matcher(input);
        if (matcher.find()){
            System.out.println("OK");
        }else {
            System.out.println("vui long kiem tra lai tai khoan");
        }

    }
}
