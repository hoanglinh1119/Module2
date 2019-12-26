package project;

import java.util.Scanner;

public class QuadraticEquation{
    private double a;
    private double b;
    private double c;
    public  QuadraticEquation(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getDelta(){
        return b*b-4*a*c;
    }
    public double getRoot1(){
        return (-b+Math.pow(getDelta(),0.5))/(2*a);
    }
    public double getRoot2(){
        return (-b-Math.pow(getDelta(),0.5))/(2*a);
    }
    public double getRoot3(){
        return -b/(2*a);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        double a=scanner.nextDouble();
        System.out.print("Enter b:");
        double b=scanner.nextDouble();
        System.out.print("Enter c: ");
        double c=scanner.nextDouble();
        QuadraticEquation quadraticEquation=new QuadraticEquation(a,b,c);
        if(quadraticEquation.getDelta()>0){
            System.out.print("ngiem thu nhat la: "+quadraticEquation.getRoot1());
            System.out.println("nghiem thu hai la: "+quadraticEquation.getRoot2());
        }else if(quadraticEquation.getDelta()==0){
            System.out.println("Pt co nghiem duy nhat la : "+quadraticEquation.getRoot3());
        }else {
            System.out.println("Pt vo nghiem!!!!!!");
        }
    }
}

