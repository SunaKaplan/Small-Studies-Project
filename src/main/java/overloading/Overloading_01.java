package overloading;

public class Overloading_01 {
    public static void main(String[] args) {
        /*
       3 tane carpim isimli method olusturalim 1. methdodda 2 tane int deger carpalim
       2. methodda 1 tane double 1 tane int deger carpalim
       3. methodda 2 tane double deger carpalim
 */
        carpim(2.5, 7.6, 1.0);
        carpim(5.6, 7);
        carpim(5, 7.6);
        carpim(5, 6);
        //autoWiding
    }

    //public static void carpim(double a, double b) {
    //    System.out.println(a*b);
    //}

    public static void carpim(double a, double b, double c) {
        System.out.println(a * b * c);
    }

    public static void carpim(double a, int b) {
        System.out.println(a * b);
    }

    public static void carpim(int a, double b) {
        System.out.println(a * b);
    }

    public static void carpim(int a, int b) {
        System.out.println(a * b);


    }
}



