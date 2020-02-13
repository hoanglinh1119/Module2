package CaseStudy2.Dictionary;

import java.util.HashMap;
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

    public static boolean suggestionsWord(HashMap<String,String> dict, String suggestions){
        String regex=suggestions+".*";
        boolean exist=false;
        Pattern pattern=Pattern.compile(regex);
        for (HashMap.Entry<String,String> entry:dict.entrySet()){
            String temp=entry.getKey();
            Matcher matcher=pattern.matcher(temp);
            if (matcher.find()){
                System.out.println(temp);
                exist=true;
            }
        }return exist;
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
