package multidimensionalarrays;

import java.util.Arrays;

public class MultidimensionalArray_01 {
        public static void main(String[] args) {
        /*
        soru 1)  bir multi-dimensional array olusturun
        ve olusturdugunuz arrayin elemanlarini yazdırınız
        */
            int sayilar[][]=new int[3][5];
            sayilar[0][1]=5;
            System.out.println(Arrays.deepToString(sayilar));

        }
}
