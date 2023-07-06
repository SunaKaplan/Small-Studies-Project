package nestedif;

import java.util.Scanner;

public class C01_ElseIf {
    public static void main(String[] args) {



    //Kullanicidan 100 uzerinden notunu isteyin.
    // Not’u harf sistemine cevirip yazdirin.
    // 50’den kucukse “D”,
    // =50  <60 arasi “C”,
    // =60  <80 arasi “B”,
    // =80’nin uzerinde ise “A”
    Scanner scan=new Scanner(System.in);

        System.out.println("lutfen 100 uzerinden notunuzu giriniz");
    double not= scan.nextDouble();
        if (not<0||not>100){
        System.out.println("gecersiz not girdiniz lutfen gecerli bir not giriniz");
    } else if (not<50) {
        System.out.println("notunuzu D'dir");
    } else if (not<60) {
        System.out.println("Notunuz C'dir");
    } else if (not<80) {
        System.out.println("Notunuz B'dir");
    }else{ System.out.println("Notunuz A'dir");}//}
        System.out.println("bizi tercih ettigimiz icin tesekkurler");
}
}

