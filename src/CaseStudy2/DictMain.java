package CaseStudy2;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class DictMain {


    public static void main(String[] args) throws IOException {

        Scanner scanner=new Scanner(System.in);
        String src = "anhviet109K.txt";
        HashMap<String,String> dict=new HashMap<>();
        AVDictController.readFile(src,dict);
        String next;
        do {
            nextProgram(dict,src,scanner);
            System.out.println("Enter 0 to exit program ");
            System.out.println("Enter any character to next program ");
             next= scanner.nextLine();
        }while (!next.equals("0"));
    }


    public static void nextProgram(HashMap<String,String> dict,String src,Scanner scanner) throws IOException {
        System.out.println("addWordToDict Enter 1:  editWordInDict Enter 2: searchWordInDict Enter 3: deleteWord Enter 4: ");
        System.out.println("Exit dictionary Enter 0: ");
        int number=scanner.nextInt();
        scanner.nextLine();
        switch (number) {
            case 1:
                AVDictController.addWordToDict(dict, src, scanner);
                break;
            case 2:
                AVDictController.editWordInDict(dict, scanner, src);
                break;
            case 3:
                AVDictController.searchWordInDict(dict, scanner);
                break;
            case 4:
                AVDictController.deleteWord(dict, scanner, src);
                break;
            default:
                System.out.println("Exit Dictionary");
        }
    }
}
