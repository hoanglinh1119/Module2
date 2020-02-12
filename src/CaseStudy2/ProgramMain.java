package CaseStudy2;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class ProgramMain {
    public static void main(String[] args) throws IOException {

        Scanner scanner=new Scanner(System.in);
        final String src = "anhviet109K.txt";
        HashMap<String,String> dict=new HashMap<>();
        FunctionIOFile.readFile(src,dict);
        String next;
        do {
            nextProgram(dict,src,scanner);
            System.out.println("Enter 0 to exit program ");
            System.out.println("Enter any character to next program ");
            next= scanner.nextLine();
        }while (!next.equals("0"));
    }


    public static void nextProgram(HashMap<String,String> dict,String src,Scanner scanner) throws IOException {
        final int add=1;
        final int repair=2;
        final int translate=3;
        final int delete=4;
        System.out.println("addWordToDict Enter 1:  editWordInDict Enter 2: searchWordInDict Enter 3: deleteWord Enter 4: ");
        System.out.println("Exit dictionary Enter 0: ");
        int number=scanner.nextInt();
        scanner.nextLine();
        switch (number) {
            case add:
                FunctionOfDictionary.addWordToDict(dict, src, scanner);
                break;
            case repair:
                FunctionOfDictionary.repairWordInDict(dict, scanner, src);
                break;
            case translate:
                FunctionOfDictionary.translateWordInDict(dict, scanner);
                break;
            case delete:
                FunctionOfDictionary.deleteWord(dict, scanner, src);
                break;
            default:
                System.out.println("Exit Dictionary");
        }
    }
}
