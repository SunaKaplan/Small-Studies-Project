package doloops;

public class doLoop05 {
    public static void main(String[] args) {
        //4. uslu sayi bulabilen java kodu yazinin
        int taban=2;
        int us=5;
        int carpimSonucu=1;
        //for (int i = 1; i <=us ; i++) {
        //    carpimSonucu*=taban;
        //}
        //System.out.println(carpimSonucu);

        int i = 1;
        do {
            carpimSonucu*=taban;
            i++;}while (i <=us);
        System.out.println(carpimSonucu);

    }
}
