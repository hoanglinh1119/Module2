package CaseStudy2.LogIn;

import java.util.ArrayList;

public class CheckIn {
    public static boolean CheckId(String in, ArrayList<UserObject>userList){
        boolean check=false;
        for (UserObject userObject : userList) {
           if ((userObject.getId()).equals(in)){
               check=true;
               break;
           }
        }return check;
    }
}
