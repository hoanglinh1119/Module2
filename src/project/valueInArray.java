package project;

import java.util.Scanner;

public class valueInArray {
    public static void main(String[] args) {
        String[] nameStudent={"hoang","linh","nam","tu","dung","vinh","phu"};
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a name:");
        String input_name=scanner.nextLine();
        boolean isExist=false;
        for(int i=0;i<nameStudent.length;i++){
            if(nameStudent[i].equals(input_name)){
                System.out.println("Position of the name student in the list:"+input_name+"is :"+(i+1));
                isExist=true;
                break;
            }
        }
        if(!isExist)
            System.out.println("Not found"+input_name+"in the list");
    }
}
