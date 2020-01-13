package Arrays.StackInJava;

import java.util.Scanner;
import java.lang.String;

public class StringStackTest {
    public static void main(String[] args)throws Exception {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap chuoi cua ban ");
        String string=scanner.nextLine();
        StringStack stringStack=new StringStack(10);
        String[] arrofStr=string.split("\\s");
        for (int i=0;i<arrofStr.length;i++){
            stringStack.push(arrofStr[i]);
        }
        for (int i=0;i<=stringStack.size();i++){
            arrofStr[i]=stringStack.pop();
        }
        for (int i=0;i<arrofStr.length;i++){
            System.out.print(arrofStr[i]+" ");
        }

    }
}
