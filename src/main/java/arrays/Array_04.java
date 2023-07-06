package arrays;

import java.util.Arrays;

public class Array_04 {
    public static void main(String[] args) {
    /*
   4.soru Verilen 5 elemanli bir array in tum elemanlarini bir soldaki konuma tasiyacak bir program yazin.
   Ornek; array (1,2,3,4,5) ise output (2,3,4,5,1) olacak
   arr[1]=arr[2]
   arr[3]=arr[4]
   */
        int arr[]={1,2,3,4,5};
        int sayi=arr[0];

        for (int i = 0; i <arr.length-1 ; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=sayi;
        System.out.println(Arrays.toString(arr));
    }
}
