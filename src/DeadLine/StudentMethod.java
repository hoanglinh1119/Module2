package DeadLine;



import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentMethod {
    public void readFile(ArrayList<StudentObjects>studentObjectsArrayList,String srcInput ) throws IOException {
        File file=new File(srcInput);
        FileReader fileReader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String line;
        String[] studentInfo;
        while ((line=bufferedReader.readLine())!=null){
            studentInfo=line.split(";");
            StudentObjects studentObjects=new StudentObjects(studentInfo[0],studentInfo[1],studentInfo[2],studentInfo[3],
                    studentInfo[4],studentInfo[5]);
            studentObjectsArrayList.add(studentObjects);
        }
        bufferedReader.close();
        fileReader.close();
    }
public void searchId(ArrayList<StudentObjects> studentObjectsArrayList, Scanner scanner){
    System.out.println("nhap ma hoc vien ban muon tim kiem: ");
        String in=scanner.nextLine();
        boolean existId=false;
    for (int i=0;i<studentObjectsArrayList.size();i++){
        if (studentObjectsArrayList.get(i).getId().equals(in)){
            display(studentObjectsArrayList,i);
            existId=true;
            break;
        }
    }
    if (!existId){
        System.out.println("Not exist!!!! ");
    }
}
public  void searchScoreBigger85(ArrayList<StudentObjects>studentObjectsArrayList){
    for (int i=0;i<studentObjectsArrayList.size();i++) {
        String temp = studentObjectsArrayList.get(i).getScore();
        if (Integer.parseInt(temp)>=85){
            display(studentObjectsArrayList,i);
        }
    }
}
public  void searchNameFollowSurname(ArrayList<StudentObjects>studentObjectsArrayList){
       String regex="^Nguyễn .*$";
       Pattern pattern=Pattern.compile(regex);
        for (int i=0;i<studentObjectsArrayList.size();i++){
            String temp=studentObjectsArrayList.get(i).getName();
            Matcher matcher=pattern.matcher(temp);
            if (matcher.find()){
                display(studentObjectsArrayList,i);
            }
        }
}
public void searchFollowFormatEmail(ArrayList<StudentObjects>studentObjectsArrayList){
        String regex="^[a-z]{1,10}(.*?)@gmail.com$";
        Pattern pattern=Pattern.compile(regex);
        for (int i=0;i<studentObjectsArrayList.size();i++){
            String temp=studentObjectsArrayList.get(i).getEmail();
            Matcher matcher=pattern.matcher(temp);
            if (! matcher.find()){
                display(studentObjectsArrayList,i);
            }
        }
}
public  void sortFollowScoreDown(ArrayList<StudentObjects>studentObjectsArrayList,String src) throws IOException {
        studentObjectsArrayList.sort(new SortFollowScoreDown());
        saveFile(src, studentObjectsArrayList);
}
public  void sortFollowName(ArrayList<StudentObjects>studentObjectsArrayList,String src) throws IOException {
        studentObjectsArrayList.sort(new SortFollowName());
         saveFile(src, studentObjectsArrayList);
}
public  void saveFile(String src, ArrayList<StudentObjects>studentObjectsArrayList) throws IOException {
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(src));
    for (StudentObjects student : studentObjectsArrayList) {
        objectOutputStream.writeObject(student);
    }
    objectOutputStream.close();
}


public void display(ArrayList<StudentObjects>studentObjectsArrayList,int i) {
    System.out.println(i + 1);
    System.out.println(" Ma hoc vien :" + studentObjectsArrayList.get(i).getId());
    System.out.println("Ho va ten : " + studentObjectsArrayList.get(i).getName());
    System.out.println(" Email : " + studentObjectsArrayList.get(i).getEmail());
    System.out.println("Chuong trinh hoc : " + studentObjectsArrayList.get(i).getCourse());
    System.out.println(" Trang thai : " + studentObjectsArrayList.get(i).getStatus());
    System.out.println(" Diem so : " + studentObjectsArrayList.get(i).getScore());
}
public void addStudent(ArrayList<StudentObjects>studentObjectsArrayList,Scanner scanner,String src) throws IOException {
    System.out.println("nhap ma hoc vien");
    String Id = scanner.nextLine();
    System.out.println("nhap ho ten :");
    String Name = scanner.nextLine();
    System.out.println("Email :");
    String Email = scanner.nextLine();
    System.out.println("Chuong trinh hoc");
    String Course = scanner.nextLine();
    System.out.println("Trang thai ");
    String status = scanner.nextLine();
    System.out.println(" Diem so ");
    String score = scanner.nextLine();
    StudentObjects studentObjects = new StudentObjects(Id, Name, Email, Course, status, score);
    studentObjectsArrayList.add(studentObjects);
    saveFile(src, studentObjectsArrayList);
}
public void editStudent(ArrayList<StudentObjects>studentObjectsArrayList,Scanner scanner,String src) throws IOException {
    System.out.println("nhap ma ho vien :");
    String id=scanner.nextLine();
    for (int i=0;i<studentObjectsArrayList.size();i++) {
       if( studentObjectsArrayList.get(i).getId().equals(id)){
           System.out.println("nhap ma hoc vien");
           String Id = scanner.nextLine();
           System.out.println("nhap ho ten :");
           String Name = scanner.nextLine();
           System.out.println("Email :");
           String Email = scanner.nextLine();
           System.out.println("Chuong trinh hoc");
           String Course = scanner.nextLine();
           System.out.println("Trang thai ");
           String status = scanner.nextLine();
           System.out.println(" Diem so ");
           String score = scanner.nextLine();
           StudentObjects studentObjects = new StudentObjects(Id, Name, Email, Course, status, score);
           studentObjectsArrayList.set(i, studentObjects);
           saveFile(src,studentObjectsArrayList);
       }
    }
}
public void removeStudent(ArrayList<StudentObjects>studentObjectsArrayList,Scanner scanner,String src){
    System.out.println("nhap ma ho vien :");
    String id=scanner.nextLine();
     int temp=-1;
    boolean exist=false;
    for (int i=0;i<studentObjectsArrayList.size();i++){
        if( studentObjectsArrayList.get(i).getId().equals(id)){
            temp=i;
            exist=true;
            break;
        }
    }
    if (exist){
        studentObjectsArrayList.remove(temp);
    }
}
}
