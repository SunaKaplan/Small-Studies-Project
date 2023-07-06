package arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_06 {
    public static void main(String[] args) {
        //soru 5)bir dogal sayi listesi olusturun ve olusturdugunuz listedeki tum ogeleri toplayın
        List<Integer> sayiListesi = new ArrayList<>();
        int toplam = 0;
        sayiListesi.add(1);
        sayiListesi.add(3);
        sayiListesi.add(5);
        sayiListesi.add(7);
        sayiListesi.add(8);
        System.out.println(sayiListesi);
        for (Integer a : sayiListesi
        ) {

            toplam += a;
        }
        System.out.println(toplam);

    }
}
