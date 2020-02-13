package CaseStudy2.Swing;

import CaseStudy2.Dictionary.FunctionIOFile;
import CaseStudy2.Dictionary.SupportFunctionOfDict;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ControllerDict {
    public static void addWordToDict(HashMap<String,String> dict, String src, Scanner scanner) throws IOException {

        System.out.println("Enter a word:");
        String keyWord=scanner.nextLine();
        boolean exist= SupportFunctionOfDict.checkDuplicate(dict,keyWord);
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

    public static String translateWordInDict(HashMap<String,String>dict, String keyWord, ArrayList<String>arrayList){
        boolean isCheck=SupportController.isCheck(dict,keyWord);
        String shows= "";
        if (isCheck) {
            for (HashMap.Entry < String, String > entry:dict.entrySet()){
                String key = entry.getKey();
                String value=entry.getValue();
                if (keyWord.equals(key)){
                    return shows+=key+"="+value;
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),"tu ban nhap ko co trong tu dien,hien thi goi y tai o output.");
            return SupportController.showSuggestions(keyWord,dict,arrayList);

        }
        return shows;

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
