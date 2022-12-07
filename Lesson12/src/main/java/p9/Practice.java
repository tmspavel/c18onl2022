package p9;

public class Practice {

    public static void main(String[] args) {
        System.out.println("start");
        int a = method();
        System.out.println("end " + a);// 1
    }

    private static int method() {
        int a = 1;
        try {
            System.out.println(a);//1
            return a;
        } finally {
            a = 2;
            System.out.println(a);//2
        }

    }
}
