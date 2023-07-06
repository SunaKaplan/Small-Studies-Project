package stringmanipulations;

public class StringManipulation03 {
    public static void main(String[] args) {
        /*
        soru 4)Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
        karakter sayısının toplamını yazdırınız.
         */
        String isim1="Seda";
        String isim2="Levent";
        String isim3="Ali Can";
        int c1=isim1.replace(" ","").length();
        int c2=isim2.replace(" ","").length();
        int c3=isim3.replace(" ","").length();
        System.out.println("karakterlerin toplami : "+(c1+c2+c3));
    }
}
