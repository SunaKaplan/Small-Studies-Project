package inheritance;

public class Runner {

    public static void main(String[] args) {
        C03_Isci isci1=new C03_Isci();
        isci1.id= isci1.idAtama();
        isci1.isim="Ali";
        isci1.soyIsim="Can";
        isci1.adres="Istanbul";
        isci1.tel="5553332211";
        isci1.mail="alican@gmail.com";
        isci1.saatUcreti=40;
        isci1.mesai=2;
        isci1.maas= isci1.maasHesapla();
        System.out.println(isci1);

        C03_Isci isci2=new C03_Isci();
        isci2.id= isci2.idAtama();
        isci2.isim="mehmet";
        isci2.soyIsim="Can";
        isci2.adres="Istanbul";
        isci2.tel="5553332211";
        isci2.mail="mehmetcan@gmail.com";
        isci2.avans=1000;
        isci2.maas= isci2.maasHesapla();
        System.out.println(isci2);

        C04_Memur memur1=new C04_Memur();
        memur1.id= memur1.idAtama();
        memur1.isim="Ali";
        memur1.soyIsim="Can";
        memur1.adres="Istanbul";
        memur1.tel="5553332211";
        memur1.mail="alican@gmail.com";
        memur1.saatUcreti=40;
        memur1.mesai=2;
        memur1.maas= memur1.maasHesapla();
        System.out.println(memur1);
    }
}
