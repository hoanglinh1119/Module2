//package Arrays;
//
//import java.util.Arrays;
//
//public class ArrayList<E> {
//    private int size=0;
//    private static final int DEFAULT_CAPACITY=10;
//    private Object elements[];
//    public ArrayList(){
//        elements=new Object[DEFAULT_CAPACITY];
//    }
//    public ArrayList(int capacity){
//        elements=new Object[capacity];
//    }
//    public void ensureCapacity(int minCapacity){
//        int newSize=elements.length*2;
//        elements= Arrays.copyOf(elements,newSize);
//    }
//    public void add(int index,E element){
//        for (int i=size-1;i>=index-1;i--){
//         elements[i+1]=elements[i];
//         elements[index]=element;
//         size++;
//        }
//    }
//    public void remove(int index){
//        for (int i=index-1;i<size-1;i++){
//            elements[i]=elements[i+1];
//            elements[size-1]=null;
//            size--;
//        }
//    }
//
//
//    public void add(String[] studentInfo) {
//    }
//}
