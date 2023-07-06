package ternary;

public class C04_Ternary {
    public static void main(String[] args) {
         /* 2 tam sayınız var;
        Her iki tamsayı da pozitifse çarpma işlemi yapın
        diger durumlarda ise "çarpma nasıl yapılır bilmiyorum"
        */
        int sayi1=45;
        int sayi2=30;
        //String str=sayi1>0&&sayi2>0?sayi1*sayi2:"çarpma nasıl yapılır bilmiyorum"; eger ben bir variable deger atamasi yapmak istiyorsam dondurdugu degere uygun data tipini secmem gerekir
        System.out.println(sayi1>0&&sayi2>0?sayi1*sayi2:"çarpma nasıl yapılır bilmiyorum");

    }
}
