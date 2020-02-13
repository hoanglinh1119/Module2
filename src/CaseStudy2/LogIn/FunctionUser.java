package CaseStudy2.LogIn;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FunctionUser {
public static void addUser(ArrayList<UserObject>userList,Scanner scanner,String src,String admin) throws IOException {
    System.out.println("Nhap id");
    String id=scanner.nextLine();
    if (Regex.checkId(id)){
        if (!CheckIn.CheckId(id,admin,userList)){
            System.out.println("Nhap pass:");
            String pass=scanner.nextLine();
            if(Regex.CheckPass(pass)){
                UserObject userObject=new UserObject(id,pass);
                userList.add(userObject);
                FuntionIOFileLogIn.writeMore(id,pass,src);
                System.out.println("thanh cong!!");
            }else {
                System.out.println("Pass cua ban sai dinh dang, vui long nhap lai: ");
                String pass1=scanner.nextLine();
                if(Regex.CheckPass(pass1)){
                    UserObject userObject=new UserObject(id,pass1);
                    userList.add(userObject);
                    FuntionIOFileLogIn.writeMore(id,pass1,src);
                    System.out.println("thanh cong!!!");
                }else {
                    System.out.println("khong thanh cong!!!");
                }

            }
        }else {
            System.out.println("Id da co nguoi su dung, vui long nhap id khac ");
            String id1=scanner.nextLine();
            if (!CheckIn.CheckId(id1,admin,userList)){
                System.out.println("nhap pass");
                String pass2=scanner.nextLine();
                if (Regex.CheckPass(pass2)){
                    UserObject userObject=new UserObject(id1,pass2);
                    userList.add(userObject);
                    FuntionIOFileLogIn.writeMore(id1,pass2,src);
                    System.out.println("thanh cong !!");
                }else {
                    System.out.println("Pass cua ban sai dinh dang, vui long nhap lai: ");
                    String pass3=scanner.nextLine();
                    if(Regex.CheckPass(pass3)){
                        UserObject userObject=new UserObject(id1,pass3);
                        userList.add(userObject);
                        FuntionIOFileLogIn.writeMore(id1,pass3,src);
                        System.out.println("thanh cong!!!");
                    }else {
                        System.out.println("khong thanh cong!!!");
                    }
                }
            }
        }
    }
}
public static void LoginUser(ArrayList<UserObject>userList,Scanner scanner,String admin) {
    System.out.println("Nhap id: ");
    String id = scanner.nextLine();
    if (CheckIn.CheckId(id, admin, userList)) {
        System.out.println("nhap pass: ");
        String pass = scanner.nextLine();
        if (CheckIn.checkPass(id, pass, userList)) {
            System.out.println("Đăng nhập thành công, bạn có thể sử dụng dịch vụ!!");

        } else {
            System.out.println("Pass không đúng, vui lòng nhập lại ");
            String pass1 = scanner.nextLine();
            if (CheckIn.checkPass(id, pass1, userList)) {
                System.out.println("Đăng nhập thành công, bạn có thể sử dụng dịch vụ!!");
            } else {
                System.out.println("Đăng nhập không thành công");
            }
        }
    } else {
        System.out.println("Nhập lại ID");
        String id1 = scanner.nextLine();
        if (CheckIn.CheckId(id1, admin, userList)) {
            System.out.println("nhap pass: ");
            String pass2 = scanner.nextLine();
            if (CheckIn.checkPass(id, pass2, userList)) {
                System.out.println("Đăng nhập thành công, bạn có thể sử dụng dịch vụ!!");

            } else {
                System.out.println("Pass không đúng, vui lòng nhập lại ");
                String pass3 = scanner.nextLine();
                if (CheckIn.checkPass(id, pass3, userList)) {
                    System.out.println("Đăng nhập thành công, bạn có thể sử dụng dịch vụ!!");
                } else {
                    System.out.println("Đăng nhập không thành công");
                }
            }
        }
    }
}

        public static void adminLogin (Scanner scanner, String idadmin, String passAdmin){
            System.out.println("Nhap id");
            String id = scanner.nextLine();
            if (id.equals(idadmin)) {
                System.out.println("Nhập pass:");
                String pass = scanner.nextLine();
                if (pass.equals(passAdmin)) {
                    System.out.println("Đăng nhập thành công!!");
                } else {
                    System.out.println("Pass đã sai, vui long nhập lại ");
                    String pass1 = scanner.nextLine();
                    if (pass1.equals(passAdmin)) {
                        System.out.println("Đăng nhập thành công!!");
                    } else {
                        System.out.println("Đăng nhập không thành công ");
                    }
                }
            } else {
                System.out.println("Nhập lại ID");
                String id1 = scanner.nextLine();
                if (id1.equals(idadmin)) {
                    System.out.println("Nhập pass:");
                    String pass2 = scanner.nextLine();
                    if (pass2.equals(passAdmin)) {
                        System.out.println("Đăng nhập thành công!!");
                    } else {
                        System.out.println("Pass đã sai, vui long nhập lại ");
                        String pass3 = scanner.nextLine();
                        if (pass3.equals(passAdmin)) {
                            System.out.println("Đăng nhập thành công!!");
                        } else {
                            System.out.println("Đăng nhập không thành công ");
                        }
                    }
                }

            }
        }
    }