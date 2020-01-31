package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClass {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String nameRegex="^[ACP]+\\d{4}+[GHIKLM]$";

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        pattern=Pattern.compile(nameRegex);
        matcher=pattern.matcher(input);
        if(matcher.find()){
            System.out.println("hop le");
        }else {
            System.out.println("khong hop le");
        }

    }
}
