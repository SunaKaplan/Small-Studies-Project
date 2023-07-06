package passbyvalues;

import java.util.Random;

public class PassByValue_02 {
    public static void main(String[] args) {
         /*
      4 elemanli bir array olusturalim
      bu array'in 2. ve 4. elemanlarini
      100'den kucuk rastgele bir sayi ile degistirelim
      sonra ayri bir method'da ve yeni halini yazdiralim
       */
        int arr[]={15,20,25,30};
        System.out.println("herseyden once array : "+arr);//{15,20,25,30};
        //Random rnd=new Random();
        //arr[1]= rnd.nextInt(100);
        //arr[3]= rnd.nextInt(100);
        //System.out.println(Arrays.toString(arr));//{15,$,25,$};//$  isareti burda random sayiyi temsil eder
        //elemanDegistir(arr);//{15,$,25,$};
        //System.out.println("methoddan sonra array : "+arr);//{15,$,25,$};
        arrayDegistir(arr);//{$,$,$}
        System.out.println("array degistir methodundan sonra : "+arr);//{15,20,25,30};

    }

    private static void arrayDegistir(int[] arr) {
        arr=new int[3];
        Random rnd=new Random();
        arr[0]= rnd.nextInt(100);
        arr[1]= rnd.nextInt(100);
        arr[2]= rnd.nextInt(100);

        System.out.println("method icinde : "+arr);

    }

    private static void elemanDegistir(int[] arr) {
        Random rnd=new Random();
        arr[0]= rnd.nextInt(100);
        arr[1]= rnd.nextInt(100);
        arr[2]= rnd.nextInt(100);
        arr[3]= rnd.nextInt(100);
        System.out.println("method icinde : "+arr);
    }
}
