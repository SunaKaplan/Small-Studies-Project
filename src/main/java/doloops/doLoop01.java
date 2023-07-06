package doloops;

public class doLoop01 {
    public static void main(String[] args) {
        //Soru 1) 5 ile 10 arasindaki(5 ve  10 dahil) sayilari  ayni satirda yazdirin
        //1.yol
        for (int i = 5; i <=10 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println("\n**************************");
        int a=5;
        while (a<=10){
            System.out.print(a+" ");
            a++;
        }
        System.out.println("\n**************************");
        int b=5;
        do {
            System.out.print(b+" ");
            b++;
        }while (b<=10);
    }//while'da once kontrol sonra dongu doWhile'da once dongu sonra kontrol
}
