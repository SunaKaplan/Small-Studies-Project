package nestedif;

import java.util.Scanner;

public class C04_NestedIf {
    public static void main(String[] args) {

        // kişininiz lunaparktaki bir alete binebilmesi icin oncelikle
        // annesinden izin almasi sonra
        // 15 yasindan buyuk olmasi ve
        // 100 kilo altinda olmasi gerekmektedir

        System.out.println("lunaparka hosgeldiniz");

        Scanner scan=new Scanner(System.in);

        System.out.println("Annenden izin alabildin mi? eger alabildiysen true alamadiysan false gir");
        boolean izinVerdiMi=scan.nextBoolean();
        if (izinVerdiMi){
            System.out.println("lutfen yasinizi giriniz");
            int yas=scan.nextInt();
            if (yas>=15){
                System.out.println("lutfen kilonuzu giriniz");
                double kilo=scan.nextDouble();
                if (kilo<100){
                    System.out.println("binebilirsiniz");
                }else System.out.println("kilonuz uygun degildir");
            }else System.out.println("yasiniz uygun degildir");

        }else System.out.println("izin alamadiysan binemezsin");

        System.out.println("bizi tercih ettiginiz icin tesekkurler");

    }
}
