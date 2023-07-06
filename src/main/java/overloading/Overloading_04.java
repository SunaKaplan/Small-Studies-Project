package overloading;

import java.util.ArrayList;
import java.util.List;

public class Overloading_04 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(3);
        myList.add(4);
        myList.add(5);
        List<Double> mylist1 = new ArrayList<>();
        mylist1.add(4.5);
        mylist1.add(3.5);
        mylist1.add(5.5);
        toplam(mylist1);
        // toplam(myList);
    } 

    private static void toplam(List<Double> mylist1) {
        double toplam = 0;
        for (double a : mylist1
        ) {
            toplam += a;
        }
        System.out.println(toplam);
    }
}

