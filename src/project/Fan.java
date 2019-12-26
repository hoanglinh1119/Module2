package project;

public class Fan {
    final int slow=1;
    final int medium=2;
    final int fast=3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setSpeed(int newSpeed) {
        if (on && newSpeed >= 1 && newSpeed <= 3) {
            speed = newSpeed;
        }
    }

    public void speedUp() {
        if (on && speed < 3){
            speed++;
        }
    }

    public void speedDown() {
        if (on && speed > 1){
            speed--;}
    }

    public double setRadius(double newRadius){
        return this.radius=newRadius;
    }
    public String setColor(String newColor){
        return this.color=newColor;
    }

    @Override
    public String toString() {
        String display="";
        if(on=true){
            display="Fan{"
                    +"speed"+speed
                    +"on"+on
                    +"radius"+radius
                    +"color"+color+"}";

        }
        return super.toString();
    }

    public static void main(String[] args) {

    }
}
