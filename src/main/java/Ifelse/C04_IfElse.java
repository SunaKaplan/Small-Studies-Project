package Ifelse;

import java.util.Scanner;

public class C04_IfElse {
    public static void main(String[] args) {
         /*
        Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
        değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
        1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
        Sesli harfler: a,e,i,o,u
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        String str= scan.next().toLowerCase();
        str=str.replaceAll("[^a-zA-Z]","*");
        str=str.replaceAll("[a,e,i,o,u]","=");
        System.out.println(str);
        if (str.contains("*")||str.length()!=1){
            System.out.println("yanlis bir giris yaptiniz");
        }
        if (str.equals("=")){
            System.out.println("sesli harf");
        }if (!str.equals("=")&&!str.contains("*")&&str.length()==1){
            System.out.println("sessiz harf");
        }

    }
}
