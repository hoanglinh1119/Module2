package Arrays.Exception;

import java.util.Random;

public class ArrayIndex {
    public Integer[] createRandom(){
        Random random=new Random();
        Integer[] arr=new Integer[100];
        System.out.println("danh sach phan tu mang la : ");
        for (int i=0;i<100;i++){
            arr[i]=random.nextInt(100);
            System.out.print(arr[i]+" ");
        } return arr;
    }

}
