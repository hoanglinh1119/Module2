package DeadLine;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class  StudentMain {
    public static void main(String[] args) throws IOException {
        final String srcInput= "hocvien.txt";
        final String srcOutputFollowArrangeScore="sapxepdiem.txt";
        final String srcOutputFollowName="sapxeptheohoten.txt";
        final int add_student=1;
        final int edit_student=2;
        final int remove_student=3;


        ArrayList<StudentObjects>arrayList=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        StudentMethod studentMethod=new StudentMethod();

        studentMethod.readFile(arrayList,srcInput);
        System.out.println("hien thi nhung nguoi co diem tren 85");
        studentMethod.searchScoreBigger85(arrayList);
        System.out.println(("hien thi theo ho nguyen"));
        studentMethod.searchNameFollowSurname(arrayList);
        System.out.println("hien thi dinh dang email sai ");
        studentMethod.searchFollowFormatEmail(arrayList);
        System.out.println(" hien thi tim theo id");
        studentMethod.searchId(arrayList,scanner);
        System.out.println("file sap xep theo diem va luu file");
        studentMethod.sortFollowScoreDown(arrayList,srcOutputFollowArrangeScore);
        System.out.println("file sap xep theo ten va luu file ");
        studentMethod.sortFollowName(arrayList,srcOutputFollowName);

        System.out.println(" ban co muon them sua xoa khong");
        System.out.println("them enter 1");
        System.out.println("sua enter 2");
        System.out.println("xoa enter 3");
      int luachon=scanner.nextInt();
      scanner.nextLine();
        switch (luachon){
            case add_student:studentMethod.addStudent(arrayList,scanner,srcInput);
            break;
            case edit_student:studentMethod.editStudent(arrayList,scanner,srcInput);
            break;
            case remove_student:studentMethod.removeStudent(arrayList,scanner,srcInput);
            break;
            default:
                System.out.println("ban da khong lua chon");
        }


    }
}
