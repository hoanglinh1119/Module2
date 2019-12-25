package project;

import java.util.Scanner;

public class MoneyBank {
    public static void main(String[] args) {
        double money = 0;
        int month = 1;
        double interestRate = 1.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("So tien vay:");
        money = scanner.nextDouble();
        System.out.println("so thang ban vay:");
        month = scanner.nextInt();
        System.out.println("Lai suat ban vay 1 nam la:");
        interestRate = scanner.nextDouble();
        double interestMoney = 0;
        for (int i = 1; i <= month; i++) {
            interestMoney = (money * interestRate /100) /12 * month;
        }
        System.out.println("So tien lai la:" + interestMoney);
    }
}
