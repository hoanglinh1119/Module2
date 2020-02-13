package Thi_Thuc_Hanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckFormat {
    public boolean isCheck_Phone(String phone){

        Pattern p=Pattern.compile("^0[0-9]{9}$");
        Matcher m=p.matcher(phone);
        return m.find();
    }

}
