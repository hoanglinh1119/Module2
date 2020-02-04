package CaseStudy2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AVDictController {


    public static void readFile(String src,HashMap<String,String> dict) throws IOException {

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
public static void showHashMap(HashMap<String,String>dict, ArrayList<String> list) {
    for (HashMap.Entry<String, String> entry : dict.entrySet()) {
        list.add(entry.getKey());
    }
}
public static void addWordToDict(HashMap<String,String>dict,String src,Scanner scanner) throws IOException {
    System.out.println("Enter a word:");
    String keyWord=scanner.nextLine();
    boolean exist=false;
    for (HashMap.Entry<String,String> entry:dict.entrySet()){
        String temp=entry.getKey();
        if (keyWord.equals(temp)) {
            exist = true;
            break;
        }
    }
    if (exist){
        System.out.println("New word exist in dictionary");
    }else {
        System.out.println("The meaning of the word: ");
        String value=scanner.nextLine();
        dict.put(keyWord,value);
        FileWriter fileWriter=new FileWriter(src,true);
        fileWriter.write("@"+keyWord+" /"+value+"\n\n");
        fileWriter.close();
    }
}
public static void editWordInDict(HashMap<String,String>dict,Scanner scanner,String src) throws IOException {
    System.out.println("Enter the word you want to correct");
    String editKeyWord=scanner.nextLine();
    boolean exist=false;
    for (HashMap.Entry<String,String> entry: dict.entrySet()){
        String temp=entry.getKey();
        if(editKeyWord.equals(temp)){
            exist=true;
            break;
        }
    }
    if (exist){
        System.out.println("New meanings of words: ");
        String editValueWord=scanner.nextLine();
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
    }else {
        System.out.println(" Not word already exists");
    }
}
public static void searchWordInDict(HashMap<String,String>dict,Scanner scanner){
    System.out.println("Enter the word you want to search :");
    String searchWord=scanner.nextLine();
    String regex=searchWord+".*";
    Pattern pattern=Pattern.compile(regex);

    for (HashMap.Entry<String,String> entry:dict.entrySet()){
        String temp=entry.getKey();
        Matcher matcher=pattern.matcher(temp);
        if (matcher.find()){
            System.out.println(temp);
        }
    }
    System.out.println("Enter your chosen word: ");
    String searchWordInDict=scanner.nextLine();
    for (HashMap.Entry<String,String> entry:dict.entrySet()){
        String temp=entry.getKey();
        if (searchWordInDict.equals(temp)){
            System.out.println(entry.getValue());
            break;
        }
    }
}
public static void deleteWord(HashMap<String,String>dict,Scanner scanner,String src) throws IOException {
      System.out.println("Find the word you want to delete");
    String findWordDelete=scanner.nextLine();
    String regex=findWordDelete+".*";
    Pattern pattern=Pattern.compile(regex);
    for (HashMap.Entry<String,String> entry:dict.entrySet()){
        String temp=entry.getKey();
        Matcher matcher=pattern.matcher(temp);
        if(matcher.find()){
            System.out.println(temp);
        }
    }
    System.out.println("Enter the word you want to delete:");
    String wordDelete=scanner.nextLine();
    dict.remove(wordDelete);
    File file=new File(String.valueOf(src));
    FileWriter fileWriter=new FileWriter(file);
    BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
    for (HashMap.Entry<String,String>entry:dict.entrySet()){
        bufferedWriter.write("@"+entry.getKey()+" /");
        bufferedWriter.write(entry.getValue()+"\n\n");
    }
    bufferedWriter.close();
    fileWriter.close();
}

}
