package multidimensionalarrays;

import java.util.Arrays;

public class MultidimensionalArrays_06 {
    public static void main(String[] args) {
        /*
        soru 6) bir multi-dimensional array olusturun ve
        outer indexlerin inner indexlerini tek tek kontrol edip
        en buyuk degerlerini yazdırın
         */
        int [][]sayilar={{1,6,3,2,0,},{4,5},{6, 7},{11,55,12,10},{77,11,55,65,23,32}};
        for (int []a: sayilar
        ) {
            Arrays.sort(a);
            System.out.println(a[a.length-1]);
        }
        System.out.println(Arrays.deepToString(sayilar));

    }
}
