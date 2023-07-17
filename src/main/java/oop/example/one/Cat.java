package oop.example.one;

public class Cat extends Animal {
    public Cat(String tur) {

        super(tur);
    }

    String animalName = "Tekir";

    @Override
    public void hareket() {

        System.out.println(getTur() + " zıplayarak hareket eder");
    }

    public void ses() {
        System.out.println(getTur() + " miyavlar");
    }
}

