package inheritance;

public class C04_Memur extends C02_Muhasebe {
    public int saatUcreti=45;
    public boolean isSigorta=true;
    public int gunlukCalismaSaati=8;
    public int kacGunCalisti=26;

    @Override
    public String toString() {
        return "C04_Memur{" +
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
    public int maasHesapla(){
        maas=saatUcreti*gunlukCalismaSaati*kacGunCalisti-avans+mesai*(saatUcreti+2)*kacGunCalisti;
        return maas;
    }
}
