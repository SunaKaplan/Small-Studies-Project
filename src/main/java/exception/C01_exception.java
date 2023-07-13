package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_exception {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir pozitif tam sayi giriniz");
        int sayi = 0;
        int sayi1 = 20;
        do {
            try {
                sayi = scan.nextInt();
                if (sayi < 1) {
                    throw new DieZahlDarfNichtNegativSein("ben sana pozitif sayi gir dedim");
                }
                //System.out.println(sayi1 / sayi);
                break;
            } catch (InputMismatchException e) {
                System.out.println("sana pozitif tam sayi gir dedim ama sen farklli bir deger girdin lutfen tekrar dene");
                scan.nextLine();
            } catch (DieZahlDarfNichtNegativSein e) {
                System.out.println("lutfen pozitif bir tam sayi gir");
            }
        } while (true);
        System.out.println(sayi);
    }
}
