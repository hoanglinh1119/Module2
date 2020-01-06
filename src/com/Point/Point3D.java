package com.Point;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z=0.0f;

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z){
        super(x,y);
        this.z=z;
    }
    public void setXYZ(float x,float y,float z){
        this.setXY(x,y);
        this.z=z;
    }
    public float[] getXYZ(){
        float[] array=new float[3];
        array[0]=getX();
        array[1]=getY();
        array[2]=z;
        return array;
    }
    public String toString(){
        return "(x,y,x)"+
                Arrays.toString(getXYZ());
    }

    public static void main(String[] args) {
        Point3D point3D=new Point3D(2.0f,3.0f,6.0f);
        System.out.println(point3D);
    }

}

