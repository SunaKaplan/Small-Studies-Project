package oop.example.two;

import java.util.ArrayList;
import java.util.List;

public class FilmLibrary {
    private List<Film> filmListesi = new ArrayList<>();

    public void filmEkle(Film film, Film film2) {
        filmListesi.add(film);
        filmListesi.add(film2);
        System.out.println(film.getAd() + " filmi listeye eklendi");
        System.out.println(film2.getAd() + " filmi listeye eklendi");
    }

    public void filmSil(Film film) {
        filmListesi.remove(film);
        System.out.println(film.getAd() + " filmi listeden silindi");
    }

    public void filmAra(String filmAdi) {
        boolean bulunamadi = true;
        for (Film w : filmListesi
        ) {
            if (w.getAd().equalsIgnoreCase(filmAdi)) {
                w.filmBilgileriniYazdir();
                bulunamadi = false;
            }
        }
        if (bulunamadi) {
            System.out.println(filmAdi + " filmi bulunamadi");
        }

    }

    public void tumFilmleriListele() {
    }
}
