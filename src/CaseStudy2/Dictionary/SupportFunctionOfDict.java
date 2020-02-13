package CaseStudy2.Dictionary;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SupportFunctionOfDict {
    public  static boolean checkDuplicate(HashMap<String,String>dict,String checkDuplicateWord){

        boolean exist=false;
        for(HashMap.Entry<String,String>entry:dict.entrySet()){
            String temp=entry.getKey();
            if(checkDuplicateWord.equals(temp)){
                exist=true;
                break;
            }
        }
        return exist;
    }

    public static void suggestionsWord(HashMap<String,String> dict,String suggestions){
        String regex=suggestions+".*";
        Pattern pattern=Pattern.compile(regex);
        for (HashMap.Entry<String,String> entry:dict.entrySet()){
            String temp=entry.getKey();
            Matcher matcher=pattern.matcher(temp);
            if (matcher.find()){
                System.out.println(temp);
            }
        }
    }
    public static void searchAndDisplay(HashMap<String,String>dict,String searchWordInDict){
        for (HashMap.Entry<String,String> entry:dict.entrySet()){
            String temp=entry.getKey();
            if (searchWordInDict.equals(temp)){
                System.out.println(entry.getValue());
                break;
            }
        }
    }
}
