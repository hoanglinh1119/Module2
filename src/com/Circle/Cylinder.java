package com.Circle;

public class Cylinder extends Circle{
    double height=2.0;
    double volume;
    public Cylinder(){
    }
    public Cylinder(String color,boolean filled,double radius,double height){
        super(color,filled,radius);
        this.height=height;
    }
    public double getVolume(){
        return super.getArea()*height;
    }
    @Override
    public String toString(){
        return "Cylinder with height ="
                +height+"\n"+
                "volume of Cylinder ="
                +getVolume()+"\n"
                +super.toString();
    }
    public static void main(String[] args) {
        Circle cylinder=new Cylinder("green",true,2.0,3.0);
        System.out.println(cylinder);
    }
}
