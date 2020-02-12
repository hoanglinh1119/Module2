package CaseStudy2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class FunctionIOFile {
    public static void writeMore(HashMap<String,String> dict, String value, String keyWord, String src) throws IOException, IOException {
        dict.put(keyWord,value);
        FileWriter fileWriter=new FileWriter(src,true);
        fileWriter.write("@"+keyWord+" /"+value+"\n\n");
        fileWriter.close();
    }

    public static void overrideAndReload(HashMap<String,String>dict,String src,String editKeyWord,String editValueWord) throws IOException {
        File file=new File(String.valueOf(src));
        FileWriter fileWriter=new FileWriter(file);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        for (HashMap.Entry<String,String>entry:dict.entrySet()){
            if(entry.getKey().equals(editKeyWord)){
                bufferedWriter.write("@"+entry.getKey()+" /");
                bufferedWriter.write(editValueWord+"\n\n");
            }else {
                bufferedWriter.write("@"+entry.getKey()+" /");
                bufferedWriter.write(entry.getValue()+"\n\n");}
        }
        bufferedWriter.write("__");
        bufferedWriter.close();
        fileWriter.close();
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

    public static void reload(HashMap<String,String>dict,String src) throws IOException {
        File file = new File(String.valueOf(src));
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (HashMap.Entry<String, String> entry : dict.entrySet()) {
            bufferedWriter.write("@" + entry.getKey() + " /");
            bufferedWriter.write(entry.getValue() + "\n\n");
        }
        bufferedWriter.close();
        fileWriter.close();
    }
}
