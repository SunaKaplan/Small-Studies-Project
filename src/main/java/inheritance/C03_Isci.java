package inheritance;

public class C03_Isci extends C02_Muhasebe {
    public int saatUcreti=30;
    public boolean isSigorta=false;
    public int gunlukCalismaSaati=10;
    public int kacGunCalisti=30;
    public String statu="isci";


    @Override
    public String toString() {
        return "C03_Isci{" +
                "id=" + id +
                ", maas=" + maas +
                ", avans=" + avans +
                ", statu='" + statu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", isSigorta=" + isSigorta +
                ", mesai=" + mesai +
                ", gunlukCalismaSaati=" + gunlukCalismaSaati +
                ", kacGunCalisti=" + kacGunCalisti +
                ", isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                ", yas='" + yas + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }

    @Override
    public int maasHesapla() {
        maas=saatUcreti*gunlukCalismaSaati*kacGunCalisti-avans+mesai*(saatUcreti+2)*kacGunCalisti;
        return maas;
    }

}
