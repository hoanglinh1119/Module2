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


    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        HashMap<String,String> dict=new HashMap<>();
        ArrayList<UserObject>userList=new ArrayList<>();
        FuntionIOFileLogIn.readFile(userList,src1);
        FunctionIOFile.readFile(src,dict);
      ShowMenu.showMenuMain(scanner,userList,src1,admin,passAdmin,dict,src);
    }
}
