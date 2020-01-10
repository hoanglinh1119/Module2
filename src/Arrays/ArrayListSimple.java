package Arrays;

import java.util.Arrays;

public class ArrayListSimple<E> {
    private int size=0;
    private static final int DEFAULT_CAPACITY=10;
    private Object element[];
    public ArrayListSimple(){
        element=new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa(){
        int newSize= element.length*2;
        element= Arrays.copyOf(element,newSize);
    }
    public void add(E e){
        if(size==element.length){
            ensureCapa();
        }
        element[size++]=e;
    }
    public E get(int i){
        if(i>=size||i<0) {
            throw new IndexOutOfBoundsException("index " + i + "size " + i);
        }
        return (E) element[i];
    }
}
