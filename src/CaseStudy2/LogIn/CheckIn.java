package CaseStudy2.LogIn;

import java.util.ArrayList;

public class CheckIn {
    public static boolean CheckId(String in,String admin, ArrayList<UserObject>userList){

        boolean check=false;
        if (!in.equals(admin)) {
            for (UserObject userObject : userList) {
                if ((userObject.getId()).equals(in)) {
                    check = true;
                    break;
                }
            }

        }return check;
    }
    public static boolean checkPass(String id,String pass,ArrayList<UserObject>userList){
        boolean check=false;
        for (UserObject userObject: userList){
            if (userObject.getId().equals(id)){
                if (userObject.getPass().equals(pass)){
                    check=true;
                    break;
                }
            }
        }
        return check;
    }
}
