package Abstract_Interface.Colorable;

public class TestSquare {
    public static void main(String[] args) {
    Square[] squarel=new Square[3];
      squarel[0]=new Square(4,"red",true);
      squarel[1]=new Square();
      squarel[2]=new Square(5);
//      Squareimlement squareimlement=new Squareimlement();
        for (Square square :squarel
        ) {
//            System.out.println(square.howToColor());
        }
    }
}
