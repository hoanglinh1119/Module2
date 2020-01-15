package Arrays.ThuatToanTK;

import java.util.Scanner;

public class TreeBinaryTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arrayList={11,1,8,2,3,5,6,8,9,10,};
         TreeBinary treeBinary=new TreeBinary(arrayList);
        System.out.println("nhap so ban muon tim");
        int numbersear=scanner.nextInt();
        scanner.nextLine();
        System.out.println(treeBinary.searchElement(numbersear));
    }
}
