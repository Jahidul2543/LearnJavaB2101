package practice;

public class WhileDemo {

    public static void main(String[] args) {
        int a = 2;
        while (a == 2){
            System.out.println("Hello");
            a = a + 1;
        }
        // [] An array
        // [] Array length is fixed
        int[] studentId = new int[10];
       // Insert value in an array
        studentId[0] = 100;
        studentId[1] = 101;
        studentId[2] = 102;
        studentId[3] = 103;
        studentId[4] = 104;
        studentId[5] = 105;
        studentId[6] = 106;
        studentId[7] = 107;
        studentId[8] = 108;
        studentId[9] = 109;
        int arrayLength = studentId.length; // 10
        int i = 0;
        while ( i < 10){
            int id = studentId[i]; // 0 --> 100
            System.out.println(id);
            i = i + 1;
            // i = 0 + 1 = 1
        }

        for(int j = 0; j < 10; j++){
            int id = studentId[j];
            System.out.println("Get Student ID using for loop --> ID: " + id);
            System.out.println("J value before exiting the loop: " + j);
        }



        // Retrieve/Get the value from array variable
//        System.out.println("Array element at index 0: " + studentId[0]);
//        System.out.println("Array element at index 1: " + studentId[1]);
//        System.out.println("Array element at index 2: " + studentId[2]);
//        System.out.println("Array element at index 3: " + studentId[3]);
//        System.out.println("Array Length: " + studentId.length);
    }
}
