package problemsdemo;

public class InvertString {
    public static void main(String[] args) {
        String str = "Google";
        invertString(str);
        invertWithoutStringBuffer(str);
    }

    private static void invertString(String str){
        StringBuffer  reverseStr = new StringBuffer();
        char[] c = new char[str.length()];
        for(int i =0; i<str.length(); i++){
            c[i] = str.charAt(i);
        }
        System.out.println(c);

        for (int i =0; i<str.length(); i++){
            reverseStr.append(c[str.length()-i-1]);
        }
        System.out.println("Reverse String" + reverseStr);
    }

    public static String invertWithoutStringBuffer(String str) {

        int length = str.length();
        String original = str;
        String invert = "";
        for (int i = length - 1; i >= 0; i--) {
            invert = invert + original.charAt(i);
        }
        System.out.println("Inverted String: " + invert);
        return invert;
    }
}
