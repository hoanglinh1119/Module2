package CaseStudy2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FunctionIOFile {

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

    public static void writeMore(HashMap<String,String> dict, String value, String keyWord, String src) throws IOException, IOException {
        dict.put(keyWord,value);
        FileWriter fileWriter=new FileWriter(src,true);
        fileWriter.write("@"+keyWord+" /"+value+"\n\n");
        fileWriter.close();
    }

//    public static void overrideAndReload(HashMap<String,String>dict,String src,String editKeyWord,String editValueWord) throws IOException {
//        File file=new File(String.valueOf(src));
//        FileWriter fileWriter=new FileWriter(file);
//        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
//        for (HashMap.Entry<String,String>entry:dict.entrySet()){
//            if(entry.getKey().equals(editKeyWord)){
//                bufferedWriter.write("@"+entry.getKey()+" /");
//                bufferedWriter.write(editValueWord+"\n\n");
//            }else {
//                bufferedWriter.write("@"+entry.getKey()+" /");
//                bufferedWriter.write(entry.getValue()+"\n\n");}
//        }
//        bufferedWriter.write("__");
//        bufferedWriter.close();
//        fileWriter.close();
//    }


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
