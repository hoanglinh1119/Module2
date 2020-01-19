package IOFile;

import java.io.*;
import java.util.Scanner;

public class CoppyFileInput {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("vui long nhap duong dan tao file moi va ten file ");
        String inputFile=scanner.nextLine();
        CreatFile(inputFile);
        WriteFile(scanner,inputFile);
        ReadFileAndCopyFile(inputFile,scanner);
    }
    public static void CreatFile(String inputFile) throws FileNotFoundException {
        try {
            File fileInput=new File(inputFile);
            if(fileInput.createNewFile()){
                System.out.println("tao file thanh cong");
            }else {
                System.out.println("file da ton tai");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void WriteFile(Scanner scanner,String inputFile){
        try {
            int count=1;
            FileWriter writer=new FileWriter(inputFile);
            System.out.println("nhap noi dung file input");
            System.out.println("nhap 2 lan enter de kt.");
            String string;
            do {
                 string=scanner.nextLine();
                writer.write(string+"\n");
            } while (!string.equals(""));
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void ReadFileAndCopyFile(String inputFile,Scanner scanner){
  try {
      FileReader fileReader=new FileReader(inputFile);
      BufferedReader bufferedReader=new BufferedReader(fileReader);
      String line=null;
      System.out.println("vui long nhap file output");
      String outputFile=scanner.nextLine();
      CreatFile(outputFile);
      FileWriter fileWriter=new FileWriter(outputFile);
      while ((line=bufferedReader.readLine())!=null){
          fileWriter.write(line);
      }
      bufferedReader.close();
      fileWriter.close();
  } catch (IOException e) {
      e.printStackTrace();
  }
    }

}
