package doloops;

public class doloop03 {

    public static void main(String[] args) {
        //Bir tamsayının tam bölenlerini ve tam bölenlerinin toplamını bulun.
        int deger=100;
        int bolen=1;
        int toplam=0;
        do {
            if (deger%bolen==0){
                System.out.println(deger+" sayisi "+bolen +" sayisana tam bolunur.");
                toplam+=bolen;
            }
            bolen++;
        }while (bolen<=deger);
        System.out.println(deger+" sayisinin toplam tamsayi boleni : "+toplam);
    }
}
