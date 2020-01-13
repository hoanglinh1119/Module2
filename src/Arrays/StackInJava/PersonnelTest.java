package Arrays.StackInJava;

import java.util.*;

public class PersonnelTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap so luong nhan vien : ");
        int count=scanner.nextInt();
        scanner.nextLine();
        LinkedList<Personnel> listPersonnel=new LinkedList<Personnel>();
        for (int i=0;i<count;i++){
            System.out.println("nhap ten nhan vien thu "+(i+1)+":");
            String name=scanner.nextLine();
            System.out.println("nhap gioi tinh nhan vien thu "+(i+1)+":");
            String gender=scanner.nextLine();
            System.out.println("nhap ngay thang nam sinh nhan vien thu "+(i+1)+":");
            String dateOfBirth=scanner.nextLine();
            Personnel personnel=new Personnel(name,gender,dateOfBirth);
            listPersonnel.add(personnel);
        }
       for (int i=0;i<count;i++){
           System.out.print("thong tin hoc vien thu "+(i+1)+":");
           listPersonnel.get(i).disPlay();
       }
        sortList(listPersonnel);
        Queue<Personnel> nu=new LinkedList<>();
       for (int i=0;i<count;i++){
           if (listPersonnel.get(i).getGender().equals("nu")){
               nu.add(listPersonnel.get(i));
           }
       }
       Queue<Personnel> nam=new LinkedList<>();
       for (int i=0;i<count;i++){
           if(listPersonnel.get(i).getGender().equals("nam")){
               nam.add(listPersonnel.get(i));
           }
       }
       LinkedList<Personnel> hoanthanh=new LinkedList<>();
       while (!nu.isEmpty()){
           hoanthanh.add(nu.poll());
       }
       while (!nam.isEmpty()){
           hoanthanh.add(nam.poll());
       }
        System.out.println("sau khi tach nam va nu: ");
        for (Personnel personnel : hoanthanh) personnel.disPlay();
       }

    public static void sortList(LinkedList<Personnel> listPersonnel ){
        Collections.sort(listPersonnel, new Comparator<Personnel>() {
            @Override
            public int compare(Personnel personnel1, Personnel personnel2) {
                return personnel1.getName().compareTo(personnel2.getName());
            }
        });
    }
}

