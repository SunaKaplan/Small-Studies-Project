package constructor;

public class TelefonConstructur {
    public String marka;
    public String model;
    public String fiyat;

    // soru 2)telefon adli bir constructer olusturun ve
    // olusturdugunuz constructer'a marka model ve fiyat parametreleri ekleyin
    // ve main classi olusturup o class icinden cagirip birkac tane telefon ekleyin

    public TelefonConstructur(String marka,String model,String fiyat){
        this.marka=marka;
        this.model=model;
        this.fiyat=fiyat;
        System.out.println(marka);
        System.out.println(model);
        System.out.println(fiyat);

    }

    public TelefonConstructur() {

    }

    public TelefonConstructur(String marka, String model) {
        this.marka=marka;
        this.model=model;
        System.out.println("fiyat belirtilmedi");
        System.out.println(marka);
        System.out.println(model);
    }
}
