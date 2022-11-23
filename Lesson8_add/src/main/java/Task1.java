import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

//        int[] ints = new int[4000000];//n
//        int anInt = ints[40000000];//O(1)

        byte[] ints1 = new byte[Integer.MAX_VALUE];//32 бита = 1 байта * 2 000 000 000

        System.out.println(Arrays.toString(ints1));

//        for (int i = 0; i < ints.length; i++) {//n
//            for (int j = 0; j < ints.length; j++) {//O(n*n)=O(n^2)
//
//            }
//            for (int j = 0; j < 10; j++) {
//
//            }//O(n*n+n)=O(n^2)
//
//        }

        //  ||(это быстрее) и |(оба условия проверяется) -

        boolean b = true;//1
        boolean b1 = false;//0
        if (b && b1) {

        }

        int n = 1;
        int n1 = 0;
        int i = n | n1;
//        if () {
//
//        }


    }
}
