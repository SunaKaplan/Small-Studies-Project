package encapsulation;

public class C06_ArabaRunner {
    public static void main(String[] args) {
        C05_Araba araba=new C05_Araba();
        araba.setModel("S90");
        araba.setUretimYili(2019);
        araba.setYakitTuru("Dizel");
        System.out.println(araba.toString());

    }
}
