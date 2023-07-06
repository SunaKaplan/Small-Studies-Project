package nestedLoop;

public class NestedLoop04 {
    public static void main(String[] args) {
             /*
10987654321
1098765432
109876543
10987654
1098765
109876
10987
1098
109
10
 */
        int satir=4;
        for (int bulSatir = 1; bulSatir <=satir ; bulSatir++) {//satir
            for (int j = satir; j >=bulSatir ; j--) {
                System.out.print(j+" ");

            }
            System.out.println();


        }
    }

}
