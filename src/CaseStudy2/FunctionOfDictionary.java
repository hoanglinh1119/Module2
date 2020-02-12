package CaseStudy2;


import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class FunctionOfDictionary {
    public static void addWordToDict(HashMap<String,String>dict,String src,Scanner scanner) throws IOException {

        System.out.println("Enter a word:");
        String keyWord=scanner.nextLine();
        boolean exist=SupportFunctionOfDict.checkDuplicate(dict,keyWord);
        if (exist){
            System.out.println("New word exist in dictionary");
        }else {
            System.out.println("The meaning of the word: ");
            String value=scanner.nextLine();
            FunctionIOFile.writeMore(dict,value,keyWord,src);
            System.out.println("Complete!!!!!!");
        }
    }

    public static void repairWordInDict(HashMap<String,String>dict,Scanner scanner,String src) throws IOException {

        System.out.println("Enter the word you want to correct");
        String editKeyWord=scanner.nextLine();
        boolean exist=SupportFunctionOfDict.checkDuplicate(dict,editKeyWord);
        if (exist){
            System.out.println("New meanings of words: ");
            String editValueWord=scanner.nextLine();
            dict.put(editKeyWord,editValueWord);
            FunctionIOFile.reload(dict,src);
            System.out.println("Complete!!!!!!");
        }else {
            System.out.println(" Not word already exists");
        }
    }

    public static void translateWordInDict(HashMap<String,String>dict,Scanner scanner){

        System.out.println("Enter the word you want to search :");
        String searchWord=scanner.nextLine();
        SupportFunctionOfDict.suggestionsWord(dict,searchWord);
        System.out.println("Enter your chosen word: ");
        String searchWordInDict=scanner.nextLine();
        System.out.println("meaning: ");
        SupportFunctionOfDict.searchAndDisplay(dict,searchWordInDict);
        System.out.println("Complete!!!!!!");
    }

    public static void deleteWord(HashMap<String,String>dict,Scanner scanner,String src) throws IOException {

        System.out.println("Find the word you want to delete");
        String findWordDelete=scanner.nextLine();
        SupportFunctionOfDict.suggestionsWord(dict,findWordDelete);
        System.out.println("Enter the word you want to delete:");
        String wordDelete=scanner.nextLine();
        dict.remove(wordDelete);
        FunctionIOFile.reload(dict,src);
        System.out.println("Complete!!!!!!");
    }
}
