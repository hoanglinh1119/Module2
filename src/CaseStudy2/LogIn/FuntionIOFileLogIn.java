package CaseStudy2.LogIn;

import Thi_Thuc_Hanh.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class FuntionIOFileLogIn {
    public static void readFile(ArrayList<UserObject> userList, String srcInput ) throws IOException {
        File file=new File(srcInput);
        FileReader fileReader;
        fileReader = new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String line;
        String[] user;
        while ((line=bufferedReader.readLine())!=null){
            user=line.split(",");
            UserObject userObject=new UserObject(user[0],user[1]);
            userList.add(userObject);
        }
        bufferedReader.close();
        fileReader.close();
    }
    public static void writeMore(String id,String pass, String src) throws  IOException {
        FileWriter fileWriter=new FileWriter(src,true);
        fileWriter.write(id+","+pass+"\n");
        fileWriter.close();
    }
    public static void reload(ArrayList<UserObject>userList,String src) throws IOException {
        File file = new File(String.valueOf(src));
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (UserObject userObject : userList) {
            bufferedWriter.write(userObject.getId() + ",");
            bufferedWriter.write(userObject.getPass() + "\n");
        }
        bufferedWriter.close();
        fileWriter.close();
    }
}
