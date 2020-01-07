package Abstract_Interface.Comparator;

import java.util.Comparator;

public class Compare implements Comparator<Circle> {
    @Override
    public int compare(Circle c2, Circle c1) {
        if(c1.getRadius()>c2.getRadius()){
            return 1;
        }else if(c1.getRadius()<c2.getRadius()){
            return -1;
        }else return 0;
    }
}
