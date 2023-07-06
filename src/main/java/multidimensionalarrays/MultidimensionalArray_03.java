package multidimensionalarrays;

import java.util.Arrays;

public class MultidimensionalArray_03 {
    public static void main(String[] args) {
         /*
        soru 3) Verilen 2 katli bir multi-dimensional array'de
        outer index'i ve inner index'i ayni olan sayilarin toplamini bulunuz
        */
        int [][]sayilar= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15,16},{17,18,19,20,25}};
        int toplam=0;
        System.out.println(Arrays.toString(sayilar[0]));
        for (int i = 0; i < sayilar.length ; i++) {
            for (int j = 0; j <sayilar[i].length ; j++) {
                if (i==j){
                    toplam+=sayilar[i][j];
                }

            }
        }
        System.out.println(toplam);

    }
}
