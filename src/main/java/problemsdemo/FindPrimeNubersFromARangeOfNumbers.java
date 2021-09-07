package problemsdemo;

public class FindPrimeNubersFromARangeOfNumbers {
    public static void main(String[] args) {
        int low = 20; int high= 50;
        while (low<=high){
            boolean flag = false;
            for(int i = 2; i<low/2; ++i ){

                // find not prime number

                if(low % i == 0){
                    flag = true;
                    break;
                }

            }
            if (!flag){
                System.out.print(low + " ");
            }


            ++low;
        }
    }
}
