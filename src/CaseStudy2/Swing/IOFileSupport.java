package CaseStudy2.Swing;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IOFileSupport {
    public void readFile(String src, HashMap<String,String> dict) {
try {InputStream inputStream=new FileInputStream(src);
    InputStreamReader inputStreamReader=new InputStreamReader(inputStream, StandardCharsets.UTF_8);
    Scanner scanner=new Scanner(inputStreamReader);
    scanner.useDelimiter("\\Z");
    String line;
    line=scanner.next();
    scanner.close();
    line=line.replaceAll("\\n","_");

    Pattern pattern=Pattern.compile("@(.*?) /(.*?)__");
    Matcher matcher=pattern.matcher(line);
    while (matcher.find()){
        dict.put(matcher.group(1),matcher.group(2));
    }

}catch (IOException ignored){
    ignored.printStackTrace();
}

    }

    public void writeMore(HashMap<String,String> dict, String value, String keyWord, String src) throws IOException, IOException {
        dict.put(keyWord,value);
        FileWriter fileWriter=new FileWriter(src,true);
        fileWriter.write("@"+keyWord+" /"+value+"\n\n");
        fileWriter.close();
    }
    public void reload(HashMap<String,String>dict,String src) throws IOException {
        File file = new File(String.valueOf(src));
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (HashMap.Entry<String, String> entry : dict.entrySet()) {
            bufferedWriter.write("@" + entry.getKey() + " /");
            bufferedWriter.write(entry.getValue() + "\n\n");
        }
        bufferedWriter.close();
        fileWriter.close();
    }
}
