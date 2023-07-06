package passbyvalues;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PassByValue_03 {
    public static void main(String[] args) {


        /*
        bir list olusturalim iki ayri method'dan
        birinde sadece elemanlari degistirelim
        digerinde yeni bir list atayip,
        ayni sayida yeni eleman ekleyelim
        ve her iki method call'dan sonra
        kendi listemizi main method icerisinde kontrol edelim
        */
        List<Integer> myList = new ArrayList<>();
        myList.add(55);
        myList.add(66);
        myList.add(77);
        myList.add(88);
        System.out.println("her seyden once listimiz : " + myList);//55,66,77,88
        // elemanDegistir(myList);//11,22,33,44

        listDegistir(myList);//55,66,15,88
        System.out.println("list degistir methodunda sonra : " + myList);//55,66,77,88

    }
        private static void listDegistir (List < Integer > myList) {
            List<Integer> newList = new ArrayList<>();
            for (int i = 0; i < myList.size(); i++) {
                newList.add(myList.get(i));
            }
            newList.set(2, 15);
            System.out.println(newList);

        }

        private static void elemanDegistir (List < Integer > myList) {
            myList.set(0, 11);
            myList.set(1, 22);
            myList.set(2, 33);
            myList.set(3, 44);
            myList.add(99);
            System.out.println("method icinde " + myList);
        }
    }


