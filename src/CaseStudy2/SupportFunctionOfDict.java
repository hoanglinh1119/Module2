package CaseStudy2;

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
    public static void readFile(String src, HashMap<String,String> dict) throws IOException {

        InputStream inputStream=new FileInputStream(src);
        InputStreamReader inputStreamReader=new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        Scanner scanner=new Scanner(inputStreamReader);
        scanner.useDelimiter("\\Z");
        String line;
        line=scanner.next();
        scanner.close();
        line=line.replaceAll("\\n","_");

        Pattern pattern=Pattern.compile("@(.*?) /(.*?)__");
        Matcher matcher=pattern.matcher(line);
        while (matcher.find()){
            dict.put(matcher.group(1),matcher.group(2));
        }
    }
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
}
