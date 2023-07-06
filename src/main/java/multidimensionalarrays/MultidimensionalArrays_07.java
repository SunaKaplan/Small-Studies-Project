package multidimensionalarrays;

public class MultidimensionalArrays_07 {
    public static void main(String[] args) {
        /*
        soru 7) Verilen bir multi dimensional array'in
        inner indexindeki elementlerinin ortalamasından
        büyük elementleri yazdıran bir kod yazınız.
         */
        int sayilar[][] = {{8, 57, 37}, {99, 88, 11}, {32, 34, 15, 12}, {2, 3, 5, 1}};
        double ort = 0;
        double toplam = 0;

        for (int i = 0; i < sayilar.length; i++) {

            for (int j = 0; j < sayilar[i].length; j++) {
                toplam += sayilar[i][j];

            }
            ort = toplam / sayilar[i].length;

            for (int j = 0; j < sayilar[i].length; j++) {
                if (ort < sayilar[i][j]) {
                    System.out.print(sayilar[i][j] + " ");
                }
            }
            System.out.println(ort);
            System.out.println("\n******************************");

            toplam = 0;
            ort = 0;
        }
    }
}
