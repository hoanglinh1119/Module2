package project;

import java.util.Scanner;

public class Rectangle {

    double height, width;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }

    public String display() {
        return "Rectangle{" + "width" + width + "height" + height + "}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter height");
        double height = scanner.nextDouble();
        System.out.print("Enter width:");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(height, width);
        System.out.println("Your ractangle \n" + rectangle.display());
        System.out.println("primeter of the rectangle:" + rectangle.getPerimeter());
        System.out.println("Area of the rectangle:" + rectangle.getArea());

    }

}


