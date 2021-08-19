package javainputoutput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReadingDemo {
    /**
     *
     * Reads a single character.
     *
     * @return The character read, or -1 if the end of the stream has been
     *         reached
     *
     * @exception IOException  If an I/O error occurs
     * public int read() throws IOException {
     *         return sd.read();
     *     }
     * */

    public static void main(String[] args) throws FileNotFoundException {
        List<Character> characterList = new ArrayList<>();
       removeWhiteSpaces(characterList);
    }

    public static List<Character> readFile(){
//        String userDirectory = System.getProperty("user.dir");
//        System.out.println(userDirectory);
//        System.out.println(System.getProperty("os.name"));
          String filePath = System.getProperty("user.dir") + "/data/data.txt";
        //String filePath = "/Users/jahidul/IdeaProjects/LearnJavaB2101/src/main/java/data/data.txt";
                List<Character> characterList = new ArrayList<>();
        int numberOfChars = 0;
        try {
            FileReader fileReader = new FileReader(filePath); // FileNotFoundException

            int i;
            while ((i=fileReader.read())!=-1) {
                //System.out.print((char) i);
                char c = (char)i;
                Character character = new Character(c);
                characterList.add(character);
                numberOfChars++;
            }
        }
        catch (IOException exception){
            exception.printStackTrace();
        }

       //characterList.forEach(c-> System.out.println(c));

        return characterList;

    }

    public static void removeWhiteSpaces(List<Character> characterList){
        characterList = readFile();
        // Store Characters without space in this list
        List<Character> characterListWithoutSpace = new ArrayList<>();
        Character character = new Character(' ');
        Character character1 = new Character(' ');
        boolean b = character.equals(character1);
        System.out.println(b); // true

        for (int i = 0; i <= characterList.size()-1; i++) {
            while (characterList.get(i).equals(new Character(' '))!=true){
               characterListWithoutSpace.add(characterList.get(i));
               break;
            }
        }

        characterListWithoutSpace.forEach(c-> System.out.println(c));

    }
}
