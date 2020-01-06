package com.Point;

import java.util.Arrays;

public class MoveablePoint extends Point2D {
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;
    public MoveablePoint(float x,float y,float xSpeed,float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void  setSpeed(float xSpeed,float ySpeed){
        this.ySpeed=ySpeed;
        this.xSpeed=xSpeed;

    }
    public float[] getSpeed(){
        float[] array1=new float[2];
        array1[0]=xSpeed;
        array1[1]=ySpeed;
        return array1;
    }
    public MoveablePoint move(){
        this.setX(this.getX()+xSpeed);
        this.setY(this.getY()+ySpeed);
        return this;
    }
    @Override
    public String toString(){
        return
                "(xSpeed,ySpeed)"+Arrays.toString(getSpeed())+"\n"+
                  super.toString();
    }

    public static void main(String[] args) {
        MoveablePoint mv=new MoveablePoint(3,4,1,2);
        System.out.println(mv);
        System.out.println(mv.move());
    }

}
