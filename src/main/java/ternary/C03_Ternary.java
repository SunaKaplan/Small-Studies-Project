package ternary;

public class C03_Ternary {
    public static void main(String[] args) {

        //Bir sayının mutlak değerini hesaplamak için kodu yazın
        //Pozitif sayılar için non sıfır mutlak değeri sayı ile aynıdır
        //negatif ise -1 ile carpin

        byte sayi=-128;
        System.out.println(sayi>0?sayi:sayi*-1);//ternary'de iki nokta ust usteden sonrasi else'i ifade eder


    }
}
