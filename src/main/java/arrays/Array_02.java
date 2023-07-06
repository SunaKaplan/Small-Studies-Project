package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array_02 {
    public static void main(String[] args) {
        /*
        2.soru bir array olusturun ve olusturdugunuz arraydeki sayilari kucukten buyuge siralayin
         */
        // int arr[]={11,7,5,9,20,12};
        // System.out.println(Arrays.toString(arr));
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(17);
        list.add(25);
        list.add(0,32);
        list.add(1,41);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

    
}
