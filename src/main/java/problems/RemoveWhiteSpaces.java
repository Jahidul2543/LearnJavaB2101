package problems;

import java.util.ArrayList;
import java.util.List;

class RemoveWhiteSpaces
{
    public static void main(String[] args)
    {
    demo();
    findASpecificLetterCountFromASentence();
    }

    public static void demo(){
        String name = "Md Jahidul Islam";
        char[] chars = name.toCharArray();
        System.out.println(chars);
        StringBuffer sb = new StringBuffer();

        for (int i =0; i<chars.length; i++){

           if(chars[i]!=' ' && chars[i] !='\t') {
               sb.append(chars[i]);
           }
        }
        System.out.print(sb);
    }

    public static void findASpecificLetterCountFromASentence(){
        String moto = "We train, we hire, we develop, we test";
        char[] chars = moto.toCharArray();
        //StringBuffer sb = new StringBuffer();

        for (int i = 0; i<chars.length; i++){
            if(chars[i] == 'w'){
                System.out.println("Number of w: " + i);
            }
        }
    }
}
