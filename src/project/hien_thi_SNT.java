package project;
public class hien_thi_SNT {
    public static void main(String[]args){
        int i=2;
       for (i=2;i<101;i++){
           if(songuyento(i)){
               System.out.println(i);
           }
       }
    }

    public static boolean songuyento(int number){
        for (int j=2;j<=Math.sqrt(number);j++){
          if(number%j==0){
              return  false;
          }
        }
        return true;
    }
}
