package problemsdemo;

public class FindLeapyear {

    /**
     * All leap years are divisible by 4 except century years are divisible by 4 and 400
     * If century years are divisible by 4 but not divisible by 400 that will not be leap year
     *
     * */
    public static void main(String[] args) {
        findLeapyear(55);
    }

    private static void findLeapyear(int year) {

        boolean flag = false;

        if(year%4==0){

            if(year%400==0){
                flag = true;
                System.out.println(year +" is leap year");
            }
            else {
                flag = false;

            }
            if(flag==false){
               flag = true;
            }
        }

        if(flag==true){
            System.out.println(year + " is leap year");
        }
        else {
            System.out.println(year + " is not leap year");
        }


    }
}
