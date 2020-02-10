package CaseStudy2;


import java.io.*;
import java.nio.charset.StandardCharsets;
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
public static void addWordToDict(HashMap<String,String>dict,String src,Scanner scanner) throws IOException {

    System.out.println("Enter a word:");
    String keyWord=scanner.nextLine();
    boolean exist=checkDuplicate(dict,keyWord);

    if (exist){
        System.out.println("New word exist in dictionary");
    }else {
        System.out.println("The meaning of the word: ");
        String value=scanner.nextLine();
        writeMore(dict,value,keyWord,src);
    }
}

public static void editWordInDict(HashMap<String,String>dict,Scanner scanner,String src) throws IOException {

    System.out.println("Enter the word you want to correct");
    String editKeyWord=scanner.nextLine();
    boolean exist=checkDuplicate(dict,editKeyWord);
    if (exist){
        System.out.println("New meanings of words: ");
        String editValueWord=scanner.nextLine();
        overrideAndReload(dict,src,editKeyWord,editValueWord);
    }else {
        System.out.println(" Not word already exists");
    }
}

public static void searchWordInDict(HashMap<String,String>dict,Scanner scanner){

    System.out.println("Enter the word you want to search :");
    String searchWord=scanner.nextLine();
          suggestionsWord(dict,searchWord);
    System.out.println("Enter your chosen word: ");
    String searchWordInDict=scanner.nextLine();
    searchAndDisplay(dict,searchWordInDict);
}

public static void deleteWord(HashMap<String,String>dict,Scanner scanner,String src) throws IOException {

      System.out.println("Find the word you want to delete");
    String findWordDelete=scanner.nextLine();
       suggestionsWord(dict,findWordDelete);
    System.out.println("Enter the word you want to delete:");
    String wordDelete=scanner.nextLine();
    dict.remove(wordDelete);
    reload(dict,src);
}
// ham
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

public static void writeMore(HashMap<String,String>dict,String value,String keyWord,String src) throws IOException {
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