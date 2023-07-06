package arrays;

public class Array_03 {
    public static void main(String[] args) {
        /*
        3.soru Verilen bir array'in tum elemanlarini toplayan bir program yazalim,
        */
        int arr[]={50,10,20,30,40};//indexlerle isim yoksa eger foreach kullanmak benim icin daha kolay olur
        System.out.println(arr[1]);
        int toplam=0;
        // for (int i = 0; i <arr.length ; i++) {
        //     toplam+=arr[i];//toplam=toplam+arr[i];
        // }
        // System.out.println(toplam);

        elemanTopla(arr);

    }

    private static void elemanTopla(int[] arr) {
        int toplam=0;
        for (int a:arr
        ) {
            toplam+=a;
        }
        System.out.println(toplam);
    }
}
