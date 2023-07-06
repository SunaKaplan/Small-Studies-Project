package inheritance;

public class C02_Muhasebe extends C01_InsanKaynaklari {
    public int maas;
    public int avans;
    public String statu;
    public int saatUcreti;
    public boolean isSigorta;
    public int mesai;
    public int gunlukCalismaSaati;
    public int kacGunCalisti;

    public int maasHesapla(){
        maas=saatUcreti*gunlukCalismaSaati*kacGunCalisti-avans+mesai*(saatUcreti+2);
        return maas;
    }
}
