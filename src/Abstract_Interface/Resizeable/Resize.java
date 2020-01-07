package Abstract_Interface.Resizeable;

public class Resize extends Circle implements Resizeable{
    @Override
    public void resize(double percent,Circle circle) {

        System.out.println("===== "+((circle.getRadius()*percent)/100+circle.getRadius()));
    }
}
