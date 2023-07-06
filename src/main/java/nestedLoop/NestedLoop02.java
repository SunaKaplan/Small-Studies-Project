package nestedLoop;

public class NestedLoop02 {

    public static void main(String[] args) {

        // asagdaki sekli nestedsiz loop ile yazdiran bir program yaziniz.
        /*
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         */
        for (int i = 1; i <=4 ; i++) {//ya sutun ya satir olabilir
            System.out.println("* * * * * *");
        }

        System.out.println("---------------------------");
        for (int i = 0; i <6 ; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 0; i <6 ; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 0; i <6 ; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 0; i <6 ; i++) {
            System.out.print("* ");
        }
        System.out.println();

        System.out.println("----------------------------");
        for (int i = 0; i <4 ; i++) {//satir
            for (int j = 0; j <6 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
