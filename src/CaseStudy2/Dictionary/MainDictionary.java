package CaseStudy2.Dictionary;

import CaseStudy2.LogIn.FunctionUser;
import CaseStudy2.LogIn.FuntionIOFileLogIn;
import CaseStudy2.LogIn.UserObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MainDictionary {
    private static final String src1= "Login.txt";
    private static final String src = "anhviet109K.txt";
    private static final String admin="hoanglinh2710";
    private static final String passAdmin="codegym1119";
    private static final int add=1;
    private static final int repair=2;
    private static final int translate=3;
    private static final int delete=4;
    private static final int userLogin=2;
    private static final int adminLogin=3;
    private static final int newUser=1;
    public static void main(String[] args) throws IOException {

        Scanner scanner=new Scanner(System.in);
        HashMap<String,String> dict=new HashMap<>();
        ArrayList<UserObject>userList=new ArrayList<>();
        FuntionIOFileLogIn.readFile(userList,src1);
        FunctionIOFile.readFile(src,dict);
      showMenuMain(scanner,userList,src1,admin,passAdmin,dict,src);
    }


    public static void showMenuDicttionaryForAdmin(HashMap<String,String> dict,String src,Scanner scanner) throws IOException {
        String next;
        do {
            System.out.println("add Word To Dict Enter 1   editWordInDict Enter 2    translate WordInDict Enter 3     deleteWord Enter 4");
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
            System.out.println("Enter 0 to exit program ");
            System.out.println("Enter any character to next program ");
            next= scanner.nextLine();
        }while (!next.equals("0"));
    }
    public static void showMenuForUser(HashMap<String,String>dict,Scanner scanner){
        int next;
        do {
            FunctionOfDictionary.translateWordInDict(dict,scanner);
            System.out.println("Ấn phím 1 để tiếp tục ");
            next=scanner.nextInt(); scanner.nextLine();
        }while (next==1);

    }

    public static void showMenuMain(Scanner scanner,ArrayList<UserObject>userList,String src1,String admin,String passAdmin,
                                     HashMap<String,String>dict,String src) throws IOException {
        System.out.println("Vui lòng đăng kí nếu chưa có tài khoản(ấn phím 1)");
        System.out.println("Ấn phím 2 nếu bạn đã có tài khoản ");
        System.out.println("Phím 3 dành cho admin");
        int luachon=scanner.nextInt();
        scanner.nextLine();
        switch (luachon){
            case newUser:FunctionUser.addUser(userList,scanner,src1,admin);
                  FuntionIOFileLogIn.readFile(userList,src1);
                  FunctionUser.LoginUser(userList,scanner,admin);
                  FunctionOfDictionary.translateWordInDict(dict,scanner);
            break;
            case userLogin:FunctionUser.LoginUser(userList,scanner,admin);
                showMenuForUser(dict,scanner);
            break;
            case adminLogin:FunctionUser.adminLogin(scanner,admin,passAdmin);
                showMenuDicttionaryForAdmin(dict,src,scanner);
            break;
            default:
                System.out.println("Bạn đã thoát chương trình");
        }
    }
}
