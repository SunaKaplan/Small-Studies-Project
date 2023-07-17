package oop.example.two;

public class Film {

    private String ad;
    private String tur;
    private int yapimyili;
    private String yonetmen;
    private double imdbPuani;

    public Film(String ad, String tur, int yapimyili, String yonetmen, double imdbPuani) {
        this.tur = tur;
        this.ad = ad;
        this.yapimyili = yapimyili;
        this.yonetmen = yonetmen;
        this.imdbPuani = imdbPuani;
    }



        //getter setter

        public String getTur() {
            return tur;
        }

        public void setTur (String tur){
            this.tur = tur;
        }
        public String getAd () {
            return ad;
        }
        public void setAd (String ad){
            this.ad = ad;
        }

        public int getYapimyili () {
            return yapimyili;
        }

    public void setYapimyili(int yapimyili) {

    }

    public String getYonetmen() {
        return yonetmen;
    }

    public void setYonetmen(String yonetmen) {
        this.yonetmen = yonetmen;
    }

    public double getImdbPuani() {
        return imdbPuani;
    }

    public void setImdbPuani(double imdbPuani) {
        this.imdbPuani = imdbPuani;
    }
    public void filmBilgileriniYazdir() {
        System.out.println("Film adi : " + ad);
        System.out.println("Tür : " + tur);
        System.out.println("Yapım Yılı : " + yapimyili);
        System.out.println("yonetmen : " + yonetmen);
        System.out.println("imdb puani : " + imdbPuani);
        System.out.println("------------------------------");
    }
    @Override
    public String toString() {
        return "Film{" +
                "tur='" + tur + '\'' +
                ", ad='" + ad + '\'' +
                ", yapimyili=" + yapimyili +
                ", yonetmen='" + yonetmen + '\'' +
                ", imdbPuani=" + imdbPuani +
                '}';
    }
}





