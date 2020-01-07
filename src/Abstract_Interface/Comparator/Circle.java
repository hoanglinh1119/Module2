package Abstract_Interface.Comparator;

import java.util.Comparator;

public class Circle {
    private double radius=1.0;
    public Circle(){
    }
    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }

    public static void main(String[] args) {
        Circle c1=new Circle(2);
        Circle c2= new Circle(5);
    }
    @Override
    public String toString(){
        return " "+getRadius();
    }

}
