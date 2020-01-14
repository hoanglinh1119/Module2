package Arrays.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Dictionary  {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
            HashMap<String, String> insert=new HashMap<>();
            insert.put("apple","táo");
            insert.put("green","màu xanh lá cây");
            insert.put("blue","xanh nước biển");
            insert.put("red","màu đỏ");
            insert.put("orange","quả cam");
            insert.put("mouse","chuột");
            insert.put("computer","máy tính");
            disPlay((HashMap<String, String>) insert);
        System.out.println("nhap tu ban muon tra cuu :");
        String keyWord=scanner.nextLine();
        search(insert,keyWord);
        System.out.println("Ban co muon them tu moi vao tu dien khong, neu them vui long an phim 1 ");
        int add=scanner.nextInt();
        scanner.nextLine();
        if(add==1){
            addDictionary(insert,scanner);
        }
         disPlay(insert);
        }

public static void disPlay(HashMap<String,String>insert) {
    Set<String> key = insert.keySet();
    for (String keys : key) {
        System.out.println(keys + "    " + insert.get(keys));
    }
  }
  public static void search(HashMap<String,String>insert, String keyWord){
      System.out.println(insert.getOrDefault(keyWord, "khong tim thay "));
  }
  public static void addDictionary(HashMap<String,String>insert,Scanner scanner){
      System.out.println("vui long nhap tu khoa");
      String keyDic=scanner.nextLine();
      Set<String> key1=insert.keySet();
      for (String key2: key1){
          if (insert.get(key2).equals(keyDic)){
              System.out.println("tu khoa da co trong thu vien,ban co muon sua khong");
          }
      }
      System.out.println("vui long nhap y nghia tu khoa ");
      String meaning=scanner.nextLine();
      insert.put(keyDic,meaning);
  }
}
