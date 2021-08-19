package javainputoutput;

import java.io.FileReader;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        readFile();
    }

    public static void readFile(){
        FileReader fileReader;
        String filePath = System.getProperty("user.dir") + "/src/main/java/data/data.txt";
        try {
             fileReader = new FileReader(filePath);
             int i;
            while ((i=fileReader.read())!=-1){
                char c = (char)i;
                System.out.print(c);
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }




        /**
         * int value of a char
         * */
        char a = ' ';
        int value = (int)a;
        System.out.println(value);
        int v = -1;
        char c = (char)v;
        System.out.println(c);
    }
}
