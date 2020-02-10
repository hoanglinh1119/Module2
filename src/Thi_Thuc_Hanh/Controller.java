package Thi_Thuc_Hanh;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    IOFile ioFile = new IOFile();
    CheckFormat checkFormat=new CheckFormat();

   public void showListPhoneBOok(ArrayList<Person> personList,String src) throws IOException {
       ioFile.readFile(personList, src);
       for (int i = 0; i < personList.size(); i++) {
           disPlayElement(personList, i);
       }
   }
   public void addNewPerson(ArrayList<Person>personArrayList, String src, Scanner scanner) throws IOException {
       System.out.println("Số điện thoai: " );
       String numberphone=scanner.nextLine();
       if(checkFormat.isCheck_Phone(numberphone)){
           System.out.println("Nhóm: " );
           String group=scanner.nextLine();
           System.out.println("Họ và tên: " );
           String name=scanner.nextLine();
           System.out.println("Giới tính: " );
           String gender=scanner.nextLine();
           System.out.println("Địa chỉ: " );
           String adress=scanner.nextLine();
           System.out.println("Ngày tháng năm sinh ");
           String birthday=scanner.nextLine();
           System.out.println("Email " );
           String email=scanner.nextLine();
           Person person=new Person(numberphone,group,name,gender,adress,birthday,email);
           personArrayList.add(person);
           ioFile.saveFile(src,personArrayList);
       }else System.out.println("so dien thoai sai dinh dang");
   }
   public void editListPhoneBook(ArrayList<Person>personArrayList,Scanner scanner,String src) throws IOException {
       System.out.println("vui long nhap so dien thoai ban muon sua :");
        String number=scanner.nextLine();
        checkFormat.isCheck_Phone(number);
        for (int i=0;i<personArrayList.size();i++){
            if (personArrayList.get(i).getNumberPhone().equals(number)){
                System.out.println("Số điện thoai: " );
                String numberphone=scanner.nextLine();
                checkFormat.isCheck_Phone(numberphone);
                System.out.println("Nhóm: " );
                String group=scanner.nextLine();
                System.out.println("Họ và tên: " );
                String name=scanner.nextLine();
                System.out.println("Giới tính: " );
                String gender=scanner.nextLine();
                System.out.println("Địa chỉ: " );
                String adress=scanner.nextLine();
                System.out.println("Ngày tháng năm sinh ");
                String birthday=scanner.nextLine();
                System.out.println("Email " );
                String email=scanner.nextLine();
                Person person=new Person(numberphone,group,name,gender,adress,birthday,email);
                personArrayList.set(i,person);
                ioFile.saveFile(src,personArrayList);
            }
        }
   }
   public void deleteContacts(ArrayList<Person>personArrayList,String src,Scanner scanner) throws IOException {
       System.out.println("Nhap so dien thoai ban muon xoa: ");
       String numberphone=scanner.nextLine();
       checkFormat.isCheck_Phone(numberphone);
       boolean exist=false;
       int temp =-1;
       for (int i=0;i<personArrayList.size();i++){
           if (personArrayList.get(i).getNumberPhone().equals(numberphone)){
               temp=i;
               exist=true;
               break;
           }

       }
       if (exist){
           personArrayList.remove(temp);
       }
       ioFile.saveFile(src,personArrayList);
   }
   public void searchFollowNumberPhone(ArrayList<Person>personArrayList,Scanner scanner){
       System.out.println("Nhap so dien thoai ban muon tim: ");
       String numberphone=scanner.nextLine();
       checkFormat.isCheck_Phone(numberphone);
       boolean exist=false;
       int temp =-1;
       for (int i=0;i<personArrayList.size();i++){
           if (personArrayList.get(i).getNumberPhone().equals(numberphone)){
               temp=i;
               exist=true;
               break;
           }

       }
       if (exist){
           disPlayElement(personArrayList,temp);
       }else {
           System.out.println(" Not exist!!!! ");
       }
   }
   public void searchFollowName(ArrayList<Person>personArrayList,Scanner scanner){
       System.out.println("Nhap ten ban muon tim: ");
       String name=scanner.nextLine();
       boolean exist=false;
       int temp =-1;
       for (int i=0;i<personArrayList.size();i++){
           if (personArrayList.get(i).getName().equals(name)){
               temp=i;
               exist=true;
               break;
           }
       }
       if (exist){
           disPlayElement(personArrayList,temp);
       }else {
           System.out.println(" Not exist!!!! ");
       }
   }
public void disPlayElement(ArrayList<Person>personArrayList, int i){
    System.out.println("Số điện thoai: "+personArrayList.get(i).getNumberPhone() );
    System.out.println("Nhóm: " +personArrayList.get(i).getGroup());
    System.out.println("Họ và tên: "+personArrayList.get(i).getName() );
    System.out.println("Giới tính: "+personArrayList.get(i).getGender() );
    System.out.println("Địa chỉ: " +personArrayList.get(i).getAdress());
    System.out.println("Ngày tháng năm sinh "+personArrayList.get(i).getBirthday() );
    System.out.println("Email " +personArrayList.get(i).getEmail());

}
}
