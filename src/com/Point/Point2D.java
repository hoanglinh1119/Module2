package com.Point;

public class Point2D {
    private float x=0.0f;
    private  float y=0.0f;
    public Point2D(float x,float y){
        this.x= x;
        this.y=y;
    }
    public Point2D(){
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }
    public void setY(float y){
        this.y=y;
    }
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        float[] array=new float[2];
        array[0]=x;
        array[1]=y;
        return array;
    }
    @Override
    public String toString(){
         return
                 "(x,y) "
                + getXY()[0] +" "+ getXY()[1];
    }

    public static void main(String[] args) {
        Point2D point2D=new Point2D(2.0f,5.0f);
        System.out.println(point2D);
    }
}
