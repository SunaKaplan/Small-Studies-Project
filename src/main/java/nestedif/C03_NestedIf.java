package nestedif;

import java.util.Scanner;

public class C03_NestedIf {
    public static void main(String[] args) {

        // bir kisinin kan bagisinda bulunup bulunamayacigini kontrol ediniz .
        // yas:18 ve uzeri olmali
        // kilo : 50 dan ust olmali
        Scanner scan = new Scanner(System.in);
        System.out.println("kan vermek istiyor musunuz?");
        boolean istiyorMu = scan.nextBoolean();
        if (istiyorMu) {
            System.out.println("lutfen yasiniz giriniz");
            int yas = scan.nextInt();
            if (yas >= 18) {
                System.out.println("lutfen kilonuzu giriniz");
                double kilo = scan.nextDouble();
                if (kilo > 50) {
                    System.out.println("kan bagisinda bulunabilirsiniz");
                } else System.out.println("kilonuz uygun degildir");
            } else System.out.println("cok kucuksun buyuyunce gel");

        } else System.out.println("istemiyosan neden geliyosun?");
    }
}
