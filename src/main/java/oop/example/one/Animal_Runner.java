package oop.example.one;

public class Animal_Runner {

    public static void main(String[] args) {
        Bird marti = new Bird("marti");
        marti.beslen();
        marti.hareket();
        marti.ses();
        System.out.println("----------------------------------");
        Cat tekir = new Cat("tekir");
        tekir.hareket();
        tekir.beslen();
        tekir.ses();
        System.out.println(tekir.animalName);
        System.out.println("-----------------------------------");
        Animal balik = new Animal("balik") {
            @Override
            public void hareket() {

            }
        };
        balik.hareket();
        balik.beslen();
        Animal kedi = new Cat("Scottish");
        kedi.beslen();
        kedi.hareket();
        System.out.println(kedi.animalName);

    }
}
