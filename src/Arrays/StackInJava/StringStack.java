package Arrays.StackInJava;

public class StringStack {
    private String arr[];
    private int size;
    private int index=1;


    public StringStack(int size){
        this.size=size;
        arr=new String[size];
    }
    public boolean isFull(){
        if(index==size){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if (index==0){
            return true;
        }
        return false;
    }
    public int size(){
        return index;
    }
    public void push( String element){
        if(isFull()){
            throw new StackOverflowError("Stack is full");
        }
        arr[index]=element;
        index++;
    }
    public String pop()throws Exception{
        if (isEmpty()){
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }

}
