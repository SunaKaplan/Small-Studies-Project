package nestedLoop;

public class NestedLoop06 {

    public static void main(String[] args) {
           /*

        * * * * .
        * * * . .
        * * . . .
        * . . . .
        . . . . .

        */
        int satir=5;
        for (int bulSatir = 1; bulSatir <=5 ; bulSatir++) {
            for (int i = 1; i <=satir-bulSatir ; i++) {
                System.out.print("* ");
            }
            for (int i = 1; i <=bulSatir ; i++) {
                System.out.print(". ");
            }
            System.out.println();
        }

    }


}
