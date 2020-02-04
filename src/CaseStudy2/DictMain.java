package CaseStudy2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DictMain {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list=new ArrayList();
        Scanner scanner=new Scanner(System.in);
        String src = "/home/hoanglinh/IdeaProjects/hoanglinh/src/CaseStudy2/anhviet109K.txt";
        HashMap<String,String> dict=new HashMap<>();
        AVDictController.readFile(src,dict);
        AVDictController.showHashMap(dict,list);
//        AVDictController.addWordToDict(dict, src,scanner);
        AVDictController.editWordInDict(dict, scanner, src);
//        AVDictController.searchWordInDict(dict,scanner);
//        AVDictController.deleteWord(dict,scanner,src);
    }
}
