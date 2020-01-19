package IOFile;

import java.io.*;

public class CopyFile {
    public static final String Source_File="/home/hoanglinh/IdeaProjects/hoanglinh/src/IOFile/hoanglinh.txt";
    public static final String Destination_File="/home/hoanglinh/IdeaProjects/hoanglinh/src/IOFile/hoanglinh11.txt";
    public static void main(String[] args) throws IOException {
        FileInputStream Fis=null;
        FileOutputStream Fos=null;
        try {
            Fis=new FileInputStream(Source_File);
            Fos=new FileOutputStream(Destination_File);
            int i;
            while ((i=Fis.read())!=-1){
                Fos.write(i);
            }
            System.out.println("copy thanh cong");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert Fis != null;
            Fis.close();
            assert Fos != null;
            Fos.close();
        }
    }
}


