package p3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String str = "carbar";//
        String str1 = "carbar";

        String str2 = new String("carbar");

        System.out.println(str == str1);//true
        System.out.println(str == str2);//false
        System.out.println(str2.intern() == str);//true


//        System.out.println(str.replaceAll("a+", "!"));
//        new StringBuilder(32)
        StringBuilder stringBuilder = new StringBuilder(str);
        String s = stringBuilder.append("12").append(12).toString();

        stringBuilder.replace(0, 2, "fouasdasdsdar");
        System.out.println(stringBuilder.length());
        stringBuilder.setLength(52313123);
        stringBuilder.append(12233);

        StringBuilder result = new StringBuilder();


        //12345
        //54321

        StringBuilder result1 = new StringBuilder("30").reverse().append("!");
        System.out.println(result1.toString());
        StringBuilder result2 = new StringBuilder();
        result2.setLength(100);
        System.out.println(result2.toString());

//        for (int i = 0; i < 10; i++) {
////            result.append("a").append(12);
//            result2.append(i);
//        }
//        System.out.println(result1.toString());
//
//        int age = 0;
//        System.out.println("Ivan "+ age);
//
//        System.out.println(result.toString());
//        result.reverse();
//        if ("a".equals(str)) {
//
//        }
//
//
////        String substring = stringBuilder.substring(3);
////        System.out.println(substring.length());
//
//        new Test().test();
//        Thread.sleep(1000);
//        System.out.println();
//        String a = "a";
//        int b = 0;
//        System.out.println();
//        System.out.println(a);
    }


}

class Test {
    public void test() {
        String str = "a";
        System.out.println(str);
    }
}
