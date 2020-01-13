package Arrays.StackInJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Personnel {
    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("d/m/yyyy");
    Calendar calendar=Calendar.getInstance();
    private String name;
    private String dateOfBirth;
    private String gender;
    public Personnel(){

    }
    public Personnel(String name,String dateOfBirth,String gender){
        this.name=name;
        this.dateOfBirth=dateOfBirth;
        this.gender=gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void disPlay(){
        System.out.printf("%10s%10s%20s%n",getName(),getDateOfBirth(),getGender());
    }

}
