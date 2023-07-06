package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayArrayList01 {
    public static void main(String[] args) {
        /*
    bir tane array bir tanede array list olusturun ve tum elemanlari yazdirin
    */
        String[] arr = {"Kirmizi", "Mor", "Yeşil", "Siyah", "Mavi"}; //new String[5];bu sekilde sinirini belirliyorum         //String arr[]
        System.out.println(Arrays.toString(arr));
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(17);
        list.add(25);
        list.add(32);
        list.add(41);
        System.out.println(list);
    }
}
