package nestedLoop;

import java.util.Scanner;

public class NestedLoop03 {
    public static void main(String[] args) {

         /*
     1 den girilen sayiya kadar her satırda bir artırarak aşağıdaki şekli oluşturan Java kodunu yazınız.
     Beklenen çıltı:
     1
     12
     123
     1234
     12345
     123456
     1234567
     12345678
     123456789
     12345678910
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen bir sayı girin ");
        int sayi = scanner.nextInt();

        for (int i = 1; i <=sayi ; i++) {//satir
            for (int j = 1; j <=i ; j++) {//sutun
                System.out.print(j+" ");
            }
            System.out.println();
        }

        /*

        CHATGPT den aldigim cevap asagida

         Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        // Şekli oluşturan döngüler
        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        Bu kod, kullanıcıdan bir sayı isteyecek ve bu sayıya kadar olan satırları oluşturacaktır.
        İç içe iki döngü kullanarak, her satırda 1'den o satırın numarasına kadar olan sayıları yazdıracaktır.
        İlk döngü, satır numarasını temsil ederken ikinci döngü, o satırdaki sayıları oluşturur.
        Sonuç olarak, istenen şekil oluşturulacaktır. Örneğin, kullanıcı 5 girdiğinde aşağıdaki gibi bir çıktı elde edilecektir:
         */

    }

}
