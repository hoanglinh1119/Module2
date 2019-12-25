package project;

public class MinOfArray {
    public static void main(String[] args) {
        int[] array={1,2,3,4,11,0,15};
        int index=MinArray(array);
        System.out.println("the smallest element in the array is:" +array[index]);

    }
    public static int MinArray(int[] array){
        int min=array[0];
        int index=0;
        for (int i=1;i<array.length;i++){
            if(min>array[i]){
                min=array[i];
                index=i;
            }
        } return index;
    }
}
