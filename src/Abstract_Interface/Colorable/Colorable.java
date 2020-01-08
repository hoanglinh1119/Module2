package Abstract_Interface.Colorable;

public interface Colorable {
    default void howToColor(){
        System.out.println("Color all four sides.");
    };
}
