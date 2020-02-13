package CaseStudy2.Swing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SupportController {
    public boolean edit(HashMap<String,String>dictionary,String keyWord){

        boolean isCheck=isCheck(dictionary, keyWord);
        boolean isedit=false;
        if (isCheck){
            for (HashMap.Entry < String, String > entry:dictionary.entrySet()) {
                String key = entry.getKey();
                if (key.equals(keyWord)) {
                    isedit = true;

                    break;
                }
            }
        }
        return isedit;
    }
    public static String showSuggestions(String stringKey, HashMap<String, String> hashMapDictionaryEngToVn, ArrayList<String> arrayList){
        String regex = stringKey + "(.*)";
        Pattern pattern = Pattern.compile(regex);
        for (HashMap.Entry<String, String> entry : hashMapDictionaryEngToVn.entrySet()) {
            String key = entry.getKey();
            Matcher matcher = pattern.matcher(key);
            if (matcher.find()){
                arrayList.add(key);
            }
        }
        StringBuilder str= new StringBuilder();
        for (String s : arrayList) {
            str.append(s).append("\n");
        }
        return str.toString();
    }
    public static boolean isCheck(HashMap<String, String> hashMapDictionaryEngToVn, String stringKey){
        boolean ischeck=false;
        for (HashMap.Entry<String,String> entry:hashMapDictionaryEngToVn.entrySet()){
            String key=entry.getKey();
            if (stringKey.equals(key)) {
                ischeck = true;
                break;
            }
        }
        return ischeck;
    }
}

