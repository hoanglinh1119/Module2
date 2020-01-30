package IOFile;

import java.io.*;

public class BinaryFile {
    public static final int BUFFER_SIZE=4096;
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide input and output files");
            System.exit(0);
        }
        String inputFile=args[0];
        String outFile=args[1];
        try {
            InputStream inputStream=new BufferedInputStream(new FileInputStream(inputFile));
            OutputStream outputStream=new BufferedOutputStream(new FileOutputStream(outFile));
            byte[] buffer = new byte[BUFFER_SIZE];

            while (inputStream.read(buffer) != -1) {
                outputStream.write(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
