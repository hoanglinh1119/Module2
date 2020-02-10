package Thi_Thuc_Hanh;

import DeadLine.StudentObjects;

import java.io.*;
import java.util.ArrayList;

public class IOFile {
    public void readFile(ArrayList<Person> personList, String srcInput ) throws IOException {
        File file=new File(srcInput);
        FileReader fileReader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String line;
        String[] peopleInfo;
        while ((line=bufferedReader.readLine())!=null){
            peopleInfo=line.split(",");
            Person person=new Person(peopleInfo[0],peopleInfo[1],peopleInfo[2],peopleInfo[3],peopleInfo[4],peopleInfo[5],peopleInfo[6]);
            personList.add(person);
        }
        bufferedReader.close();
        fileReader.close();
    }
    public  void saveFile(String src, ArrayList<Person>personList) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(src));
        for (Person person : personList) {
            objectOutputStream.writeObject(person);
        }
        objectOutputStream.close();
    }
}
