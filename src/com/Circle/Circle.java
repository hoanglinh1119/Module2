package com.Circle;

public class Circle {
    private String color="green";
    private boolean filled=true;
    private double radius=1.0;
    public Circle(){
    }
    public Circle(String color,boolean filled,double radius){
        this.color=color;
        this.filled=filled;
        this.radius=radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor( String color){
        this.color=color;
    }

    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    @Override
    public String toString(){
        return "A shape with color of "
                +getColor()+"\n"
                +"and"
                +(isFilled()?"filled":"not filled")
                +"A circle with radius = "
                +getRadius()+"\n"
                +"the area of circle = "
                +getArea();
    }
}
