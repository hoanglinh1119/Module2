package Thi_Thuc_Hanh;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        final String src="PhoneBook.csv";

        ArrayList<Person> list=new ArrayList<>();
        Controller controller=new Controller();
        IOFile ioFile=new IOFile();
        Scanner scanner=new Scanner(System.in);


        System.out.println("-----CHUONG TRINH QUAN LI DANH BA------ ");
        System.out.println("Chon chuc nang theo so(de tiep tuc): ");
        System.out.println("1. Xem danh sách");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập Nhật");
        System.out.println("4.Xóa");
        System.out.println("5.Tìm Kiếm");
        System.out.println("6.Đọc Từ File");
        System.out.println("7.Ghi từ file");
        System.out.println("8. thoát");
        int luachon=scanner.nextInt();
        scanner.nextLine();
        switch (luachon){
            case 1:
                controller.showListPhoneBOok(list,src);
            break;

            case 2:
                controller.addNewPerson(list,src,scanner);
            break;

            case 3:
                controller.editListPhoneBook(list,scanner,src);
            break;

            case 4:
                controller.deleteContacts(list,src,scanner);
            break;
            case 5:
                System.out.println("tim theo so dien thoai an phim 1, theo ten an phim 2");
                int so=scanner.nextInt();
                scanner.nextLine();
                switch (so){
                    case 1: controller.searchFollowNumberPhone(list,scanner);
                    break;
                    case 2:controller.searchFollowName(list,scanner);
                    break;
                    default:
                        System.out.println("vui long chi chon 1 hoac 2");
                }
                break;
            case 6:ioFile.readFile(list,src);
            break;
            case 7:ioFile.saveFile(src,list);
            break;
            default:
                System.out.println("ban da khong chon" );
        }


    }
}
