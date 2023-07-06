package nestedLoop;

public class NestedLoop01 {
    public static void main(String[] args) {

        int arr[][]= {{5},{1,2},{3,4}};
        String str="Ali Can";
        // for (int i = 0; i <str.length() ; i++) {//1. boyutta bunu kullabiliriz
        //     System.out.print(str.charAt(i));// ya alt alta ya da tek bir satirda yazdirabilirim
        // }
        for (int i = 0; i < arr.length; i++) {
            //System.out.print(Arrays.toString(arr[i]));
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);

            }
        }
    }
}
