package constructor;

public class Constructur_01 {

    //soru 1) birkac tane constructer cagirip bu constructerlari inceleyelim

    public static void main(String[] args) {

        Constructur_01 obj1 = new Constructur_01();//javanin bizim icin olusturdugu cons
        Constructur_01 obj2 = new Constructur_01(5);//javanin bizim icin olusturdugu cons


    }

    public Constructur_01() {
        System.out.println("defualt cons calisti");
    }

    Constructur_01(int a) {
        System.out.println("parametreli cons calisti");
    }

}
