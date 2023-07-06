package overloading;

public class Overloading_03 {
    public static void main(String[] args) {
        Overloading_03 obj1=new Overloading_03(5,7);
        Overloading_03 obj2=new Overloading_03(5.6,7.5);
        Overloading_03 obj3=new Overloading_03(5,7.5);
        Overloading_03 obj4=new Overloading_03(5.5,7);

    }

    Overloading_03(double b,double a){
        System.out.println(a+b);
    }
    Overloading_03(int b,double a){
        System.out.println(a+b);
    }

    Overloading_03(int a ,int b){
        System.out.println(a+b);
    }
    }

