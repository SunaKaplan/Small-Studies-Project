package sql;


    /*Subquery {
    --SUBQUERY

    CREATE TABLE memurlar
            (
                    memur_id int primary key,
                    memur_isim VARCHAR(50),
    memur_maas int
);

    INSERT INTO memurlar VALUES(101, 'Ali Can', 12000);
    INSERT INTO memurlar VALUES(102, 'Veli Han', 2000);
    INSERT INTO memurlar VALUES(103, 'Ayse Kan', 7000);
    INSERT INTO memurlar VALUES(104, 'Melek Tan', 8500);

    select * from memurlar;

        --Veli Han'ın maas değerini en yüksek maas değerine esitleyin

    update memurlar
    set memur_maas = (select max(memur_maas) from memurlar)
    where memur_isim ='Veli Han';

        --12000 --> max memur maas degeridir ben bunu baska bir sorgu ile elde edebilirim
--max maası veren sorgu:
    select max(memur_maas) from memurlar;

        --Ali Can'ın maas değerini en düşük maas değerinin 1.5 katına esitleyin
    update memurlar
    set memur_maas = (select min(memur_maas)*1.5 from memurlar)
    where memur_isim ='Ali Can';

        --min maas * 1.5 veren sorgu:
    select min(memur_maas)*1.5 from memurlar


        --Melek Tanın maasını Ayse Kan ve Veli Hanın maasları toplamına esıtleyın
    update memurlar
    set memur_maas =(select sum(memur_maas) from memurlar
    where memur_isim in('Ayse Kan', 'Veli Han'))
    where memur_isim='Melek Tan';

        --ayse ve velinin maas top veren sorgu
    select sum(memur_maas) from memurlar where memur_isim in('Ayse Kan', 'Veli Han')

            --Ortalama maas değerinden düşük olan maas değerlerini 1000 artırın.
--ortalama maas degerini bulalım
    select round(avg(memur_maas)) from memurlar;--12125

    update memurlar
    set memur_maas = memur_maas + 1000
    where memur_maas<(select round(avg(memur_maas)) from memurlar);

        --Ortalama maas değerinden düşük maas değerlerine ortalama maas değeri atayın.
            --ortalama maas veren sorgu:
    select round(avg(memur_maas)) from memurlar;--12875

    update memurlar
    set memur_maas =(select round(avg(memur_maas)) from memurlar)
    where memur_maas<(select round(avg(memur_maas)) from memurlar)


    CREATE TABLE calisan
            (
                    id int,
                    isim VARCHAR(50),
    sehir VARCHAR(50),
    maas int,
    isyeri VARCHAR(20)
);

    INSERT INTO calisan VALUES(123456789, 'Ali Seker', 'Istanbul', 2500, 'Vakko');
    INSERT INTO calisan VALUES(234567890, 'Ayse Gul', 'Istanbul', 1500, 'LCWaikiki');
    INSERT INTO calisan VALUES(345678901, 'Veli Yilmaz', 'Ankara', 3000, 'Vakko');
    INSERT INTO calisan VALUES(456789012, 'Veli Yilmaz', 'Izmir', 1000, 'Pierre Cardin');
    INSERT INTO calisan VALUES(567890123, 'Veli Yilmaz', 'Ankara', 7000, 'Adidas');
    INSERT INTO calisan VALUES(456789012, 'Ayse Gul', 'Ankara', 1500, 'Pierre Cardin');
    INSERT INTO calisan VALUES(123456710, 'Fatma Yasa', 'Bursa', 2500, 'Vakko');

    CREATE TABLE markalar
            (
                    marka_id int,
                    marka_isim VARCHAR(20),
    calisan_sayisi int
);

    INSERT INTO markalar VALUES(100, 'Vakko', 12000);
    INSERT INTO markalar VALUES(101, 'Pierre Cardin', 18000);
    INSERT INTO markalar VALUES(102, 'Adidas', 10000);
    INSERT INTO markalar VALUES(103, 'LCWaikiki', 21000);


    select * from calisan;

        -- SORU1: calisan sayisi 15.000’den cok olan isyeri'lerini ve
            --bu markada calisanlarin isimlerini ve maaşlarini listeleyin.

    select isyeri, isim ,maas from calisan
    where isyeri in(select marka_isim from markalar where calisan_sayisi>15000);

        --calisan sayisi 15000den cok olan isyerlerini veren sorgu
    select marka_isim from markalar where calisan_sayisi>15000

            -- SORU2: Ankara’da calisani olan markalarin
--marka id'lerini ve calisan sayilarini listeleyiniz.

    select * from calisan

        --ankarada calısanı olan isyerleri:vakko, adidas , pierre cardin
--bu isyerlerini veren sorgu

    select isyeri from calisan where sehir='Ankara';

    select marka_id, calisan_sayisi from markalar
    where marka_isim in(select isyeri from calisan where sehir='Ankara');
}*/





