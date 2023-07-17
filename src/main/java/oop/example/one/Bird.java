package oop.example.one;

public class Bird extends Animal {

    public Bird(String tur) {

        super(tur);
    }

    @Override
    public void hareket() {

        System.out.println(getTur()+" ucarak hareket etti");
    }

    public void ses(){

        System.out.println(getTur()+" oter");
    }


    }
