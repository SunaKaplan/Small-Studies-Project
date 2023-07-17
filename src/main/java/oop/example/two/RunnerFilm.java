package oop.example.two;

public class RunnerFilm {
    public static void main(String[] args) {
        Film film1=new Film("GORA","Komedi",2012,"Cem Yılmaz",7.8);
        Film film2=new Film("AROG","Bilim Kurgu",2015,"Cem Yılmaz",9.8);
        FilmLibrary filmKutuphanesi=new FilmLibrary();
        filmKutuphanesi.filmEkle(film1,film2);
        filmKutuphanesi.filmAra("GORAA");
        filmKutuphanesi.tumFilmleriListele();
        filmKutuphanesi.filmSil(film2);
        filmKutuphanesi.tumFilmleriListele();

    }
}

