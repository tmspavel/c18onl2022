public class P1 {
    public static void main(String[] args) {
        //Работа с разными системами счисления целых чисел.

        int a = 0b1101010110; //2 система(0 или 1)

//        1*2^9+ 1*2^8 +01010110

        int b = 012314; //8 система(0 1 2 3 4 5 6 7)

        int c = 456;//10 (0 до 9)

        int d = 0x141D12;//16 система (0 до 9 и A B C D E F)
        //A   B  C  D  E  F
        //10 11 12 13 14 15

        int result = (int) (1 * Math.pow(16, 5) + 4 * Math.pow(16, 4) + 1 * Math.pow(16, 3)
                + 13 * Math.pow(16, 2) + 1 * Math.pow(16, 1) + 2 * Math.pow(16, 0));


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(result);

        System.out.println(d == result);
    }

}
