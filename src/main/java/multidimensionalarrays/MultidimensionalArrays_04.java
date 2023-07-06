package multidimensionalarrays;

import java.util.Arrays;

public class MultidimensionalArrays_04 {
    public static void main(String[] args) {
        /*
        Soru 4) Asagidaki multi dimensional array'in
        ic array'lerindeki tum elemanlarin toplamini birer birer bulan
        ve herbir sonucu yeni bir array'in elemani yapan
        ve yeni array'i ekrana yazdiran bir program yaziniz
        Ornek; {{1,2,3}, {4,5}, {6, 7} } ==> 1 + 2 + 3 = 6 4+5=9 6+7=13 ==> output: (6, 9, 13)
         */
        int [][]sayilar={{1,2,3},{4,5},{6, 7},{11,22,33},{15,25,65}};
        int yeniArray[]=new int[sayilar.length];

        int toplam=0;
        for (int i = 0; i < sayilar.length ; i++) {

            for (int j = 0; j < sayilar[i].length ; j++) {
                toplam+=sayilar[i][j];
            }yeniArray[i]=toplam;
            toplam=0;

        }
        System.out.println(Arrays.toString(yeniArray));
    }
}
