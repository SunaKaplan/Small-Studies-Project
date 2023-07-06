package multidimensionalarrays;

public class MultidimensionalArray_02 {
    public static void main(String[] args) {
        /*
        soru 2) verilen bir multi-dimensional array in
        tum elementlerini yazdiran bir method olusturun
        */
        int [][][]sayilar= {{{35, 28, 15}, {50, 9, 3, 80}, {67, 87, 75}, {10, 150}},{{1}, {2}}};
        int []sayilar1= {35,28,15};
        //for (int a:sayilar1
        //     ) {
        //
        //}
        elementYazdir(sayilar);

    }

    public static void elementYazdir(int[][][] sayilar) {
        for (int e[][]:sayilar
        ) {

            for (int []a:e
            ) {
                for (int w:a
                ) {
                    System.out.print(w+" ");
                }
                System.out.println("\n ********************************");
            }

        }}

    }

