package CaseStudy2.LogIn;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static boolean checkId(String in){
        String regex="^[a-z]{1,12}[0-9]{1,6}$";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(in);
        return m.find();
    }
    public static boolean CheckPass(String in){
        String regex="^[a-z]{1,12}[0-9]{1,6}$";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(in);
        return m.find();
    }
}
