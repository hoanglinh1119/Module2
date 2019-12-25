package project;

import java.util.Scanner;

public class Pluselement {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 9, 8, 3, 7, 0, 5, 0, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter index want to plus:");
        int index = scanner.nextInt();
        System.out.print("input value of index:");
        int value=scanner.nextInt();
        System.out.printf("%-12%s%s", "Array after plus element:", "");
        for (int i=0;i<array.length;i++) {
            if (i >= index) {
                array[i] = array[i - 1];
                System.out.print(array[i] + "\t");
            } else if (i == index - 1) {
                array[i] = value;
                System.out.print(array[i] + "\t");
            } else {
                System.out.print(array[i] + "\t");
            }

        }
    }
}