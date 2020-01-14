package Arrays.Collections;

import java.util.Scanner;

public class TreeBinaryTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" chuoi cac so ban muon sap xep co bao nhieu so :");
        int lengOfTree=scanner.nextInt();
        scanner.nextLine();
        TreeBinary treeBinary=new TreeBinary();
        for (int i=0;i<lengOfTree;i++){
            System.out.println("nhap so thu"+(i+1)+":");
            treeBinary.insert(scanner.nextInt());
        }
        System.out.println("Tree binary: ");
        treeBinary.sort();
    }
}
