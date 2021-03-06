package Arrays.LinkedList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberStudent;
        String name;
        String id;
        int year;
        int luachon ;
        String address;
        System.out.println("nhập vào số học sinh:");
        numberStudent=sc.nextInt();
        sc.nextLine();

        LinkedList <Student> list=new LinkedList<Student>();
        for(int i=0;i<=numberStudent-1;i++){
            System.out.println("nhap ten hoc vien "+(i+1)+":");
            name=sc.nextLine();
            System.out.println("nhap id hoc vien "+(i+1)+":");
            id=sc.nextLine();
            System.out.println("nhap tuoi hoc vien "+(i+1)+":");
            year=sc.nextInt();
            sc.nextLine();
            System.out.println("nhap que quan hoc vien "+(i+1)+":");
            address=sc.nextLine();
            Student student=new Student(name,id,year,address);
            list.add(student);
        }
        disPlay(list);
        System.out.println("chọn tính năng bạn muốn:");
        System.out.println("1. thêm.");
        System.out.println("2. sửa.");
        System.out.println("3. xóa.");
        System.out.println("4.tim kiem");
        luachon=sc.nextInt();
        switch (luachon){
            case 1:
                addStudentForList(sc,list);
                break;
            case 2:
                editStudentForList(sc,list);
                break;
            case 3:
                removeStudentForList(sc,list);
                break;
            case 4:
                searchStudentForList(list,sc);
                break;
            default:
                System.out.println("bạn không chọn tính năng nào.");
        }
    }
    public static void disPlay(LinkedList<Student>list){
        for(int i=0;i<list.size();i++){
            list.get(i).disPlay();
        }
    }
    public static void addStudentForList(Scanner scanner,LinkedList<Student> list){
        int addLocation;
        System.out.println("bạn muốn thêm vào vị trí nào: ");
        addLocation=scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhập thông tin cho đối tượng cần thêm:");
        System.out.println("nhap ten hoc vien :");
        String name=scanner.nextLine();
        System.out.println("nhap id hoc vien :");
        String id=scanner.nextLine();
        System.out.println("nhap tuoi hoc vien :");
        int year=scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhap que quan hoc vien :");
        String address=scanner.nextLine();
        Student student=new Student(name,id,year,address);
        list.add(addLocation,student);
        disPlay(list);
    }
    public static void removeStudentForList(Scanner scanner,LinkedList<Student> list){
        int removeLocation;
        System.out.println("nhập vị trí cần xóa:");
        removeLocation=scanner.nextInt();
        list.remove(removeLocation);
        disPlay(list);
    }
    public static void editStudentForList(Scanner scanner,LinkedList<Student>list){
        int editAddress;
        System.out.println("nhập vị trí cần sửa thông tin : ");
        editAddress=scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhập thông tin cần sửa gom :");
        System.out.println("nhap ten hoc vien :");
        String name=scanner.nextLine();
        System.out.println("nhap id hoc vien :");
        String id=scanner.nextLine();
        System.out.println("nhap tuoi hoc vien :");
        int year=scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhap que quan hoc vien :");
        String address=scanner.nextLine();
        Student student=new Student(name,id,year,address);
        student=list.set(editAddress,student);
        disPlay(list);
    }
    public static void searchStudentForList(LinkedList<Student> list,Scanner scanner){
        disPlay(list);
        System.out.println("tim theo que quan : Enter 1 ");
        System.out.println("tim theo ho ten hoc vien : Enter 2 ");
        System.out.println("tim theo ma hoc vien : Enter 3 ");
        System.out.println("tim theo tuoi : Enter 4 ");
        System.out.println("vui long chon cach tim kiem: ");
        int luachon1=scanner.nextInt();
        scanner.nextLine();
        switch (luachon1){
            case 1:
                System.out.println("nhap que quan hoc vien: ");
                String address=scanner.nextLine();
                boolean notMatchingInformation=true;
                for (int i=0;i<list.size();i++){
                    if (list.get(i).getAddress().equals(address)){
                        list.get(i).disPlay();
                        notMatchingInformation=false;
                    }
                }
                if (notMatchingInformation){
                    System.out.println("khong tim thay ");
                }
                break;
            case 2:
                System.out.println("nhap ho va ten hoc vien: ");
                String name=scanner.nextLine();
                boolean notMatchingName=true;
                for (int i=0;i<list.size();i++){
                    if (list.get(i).getName().equals(name)){
                        list.get(i).disPlay();
                        notMatchingName=false;
                    }
                }
                if(notMatchingName){
                    System.out.println(" khong tim thay");
                }
                break;
            case 3:
                System.out.println("nhap ma hoc vien: ");
                String id=scanner.nextLine();
                boolean notMatchingId=true;
                for (int i=0;i<list.size();i++){
                    if (list.get(i).getId().equals(id)){
                        list.get(i).disPlay();
                        notMatchingId=false;
                    }
                }
                if (notMatchingId){
                    System.out.println(" khong tim thay");
                }
                break;
            case 4:
                System.out.println("nhap tuoi hoc vien : ");
                int year=scanner.nextInt();
                scanner.nextLine();
                boolean notMatchingYears=true;
                for (int i=0;i<list.size();i++){
                    if (list.get(i).getYear()==year){
                        list.get(i).disPlay();
                        notMatchingYears=false;
                    }
                }
                if (notMatchingYears){
                    System.out.println("khong tim thay");
                }
                break;
            default:
                System.out.println("ban da khong chon tim kiem");
        }
    }
}
