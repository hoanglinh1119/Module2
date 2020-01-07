package Abstract_Interface.Resizeable;

import java.util.Scanner;

public class TestResize {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" nhap gia tri percent :");
        double percent=scanner.nextDouble();
        Circle circle=new Circle(2.0);
        Resize resize=new Resize();
        resize.resize(percent,circle);
    }
}
