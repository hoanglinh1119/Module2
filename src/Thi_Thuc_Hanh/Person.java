package Thi_Thuc_Hanh;

public class Person {
    private String name;
    private String numberPhone;
    private String adress;
    private String group;
    private String gender;
    private String email;
    private String birthday;

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }




    public Person(){
    }
    public Person(String numberPhone,String group,String name,String gender,String adress, String birthday,String email) {
        this.numberPhone = numberPhone;
        this.group = group;
        this.name = name;
        this.gender = gender;
        this.adress = adress;
        this.birthday = birthday;
        this.email = email;

    }
}
