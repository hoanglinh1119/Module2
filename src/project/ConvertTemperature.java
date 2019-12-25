package project;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("menu");
        System.out.println("1.Celsius to fahreheit");
        System.out.println("2.fahrenheit to celsius");
        System.out.println("Enter your choice:");
        int choice=scanner.nextInt();
        switch (choice){
            case 1:
                System.out.print("Enter a value of celsius:");
                double celsius=scanner.nextDouble();
                System.out.println("Celsius to fahreheit :"+celsiustofahreheit(celsius));
                break;
            case 2:
                System.out.print("Enter a value of Fahreheit:");
                double fahreheit=scanner.nextDouble();
                System.out.println("Fahreheit to Celsius:"+fahreheittocelsius(fahreheit));
                break;
        }


    }
    public static double celsiustofahreheit(double celsius){
        double fahreheit=(9.0/5)*celsius+32;
        return fahreheit;
    }
    public static double fahreheittocelsius(double fahreheit){
        double celsius=(5.0/9)*(fahreheit-32);
        return celsius;
    }
}
