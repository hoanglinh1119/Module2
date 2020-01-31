package Regex;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPhone {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String numberRegex="^\\(\\d{2}\\)-\\(\\d{10}\\)$";

    public static void main(String[] args) {

        String[] number= {"(84)-(0982243340)","(84)-(098223)"};
        pattern=Pattern.compile(numberRegex);

        for (String s : number) {
            matcher = pattern.matcher(s);
            if (matcher.find()) {
                System.out.println(s + " hop le");
            } else {
                System.out.println(s + " khong hop le");
            }
        }
}
}
