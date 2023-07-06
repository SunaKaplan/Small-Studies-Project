package nestedLoop;

public class NestedLoop05 {

    public static void main(String[] args) {
/*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *

*
**
***
****
*/
        int satir=5;
        for (int bulSatir = 1; bulSatir <=satir ; bulSatir++) {
            for (int i = 1; i <=bulSatir ; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int bulSatir = satir-1; bulSatir >=1 ; bulSatir--) {
            for (int j = bulSatir; j >=1 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
