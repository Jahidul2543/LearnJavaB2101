package math;

public class Piramid {
    public static void main(String[] args) {
      Piramid obj = new Piramid();
     // obj.piramid(10);
      //  obj.lShapePiramid(10);
        obj.upSidedownLShapePiramid(10);

    }

    public void piramid(int n){
        int k = n;

        for(int i = 0; i<n; i++){

            for (int j = 0; j<k; j++){
                System.out.print(" ");
            }

            k = k -1;

            for (int j = 0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void lShapePiramid(int n){
        for(int i = 0; i<n; i++){

            for (int j = 0;j<i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public void upSidedownLShapePiramid(int n){
        for(int i = 0; i<n; i++){

            for (int j = 0;j<n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
