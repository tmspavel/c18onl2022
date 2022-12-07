package a1;

import p1.CarException;

public class Test {
    public static void main(String[] args) {
        int weight = 9;
//        try {
        int i = 7 / 0;
        try {
            run(weight);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("234234");
//        } catch (Exception exception) {
//            System.out.println(exception.getMessage());
//        }
    }

    private static void run(int weight) throws Exception {
        if (weight > 8) {
            throw new CarException("Ваша машина больше 8 тонн, езжайте в объезд");
        } else {
            throw new Exception("> 8 тонн");
        }

//        System.out.println("12344");
    }
}
