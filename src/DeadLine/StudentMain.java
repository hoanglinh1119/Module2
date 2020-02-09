package DeadLine;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) throws IOException {
        final String srcInput= "hocvien.txt";
        final String srcOutputFollowArrangeScore="sapxepdiem.txt";
        final String srcOutputFollowName="sapxeptheohoten.txt";
        ArrayList<StudentObjects>arrayList=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        StudentMethod studentMethod=new StudentMethod();
        studentMethod.readFile(arrayList,srcInput);
        System.out.println(" hien thi tim theo id");
       studentMethod.searchId(arrayList,scanner);
        System.out.println("hien thi nhung nguoi co diem tren 85");
        studentMethod.searchScoreBigger85(arrayList);
        System.out.println(("hien thi theo ho nguyen"));
        studentMethod.searchNameFollowSurname(arrayList);
        System.out.println("hien thi dinh dang email sai ");
        studentMethod.searchFollowFormatEmail(arrayList);
        System.out.println("file sap xep theo diem va luu file");
        studentMethod.sortFollowScoreDown(arrayList,srcOutputFollowArrangeScore);
        System.out.println("file sap xep theo ten va luu file ");
        studentMethod.sortFollowName(arrayList,srcOutputFollowName);
    }
}
