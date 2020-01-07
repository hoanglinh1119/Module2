package Abstract_Interface.Colorable;

public class Square implements Colorable {
    private double side=1.0;
    private  String color="green";
    private boolean filled=true;
    public Square(){
    }
    public Square(double side){
        this.side=side;
    }
    public Square( double side,String color,boolean filled){
        this.side=side;
        this.color=color;
        this.filled=filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea(){
        return getSide()*getSide();
    }
    public double getPrimer(){
        return 4*getSide();
    }

    @Override
    public String toString() {
        return "Area : "+ getArea() ;
    }

    @Override
    public void howToColor() {
        System.out.println(getColor());
    }
}
