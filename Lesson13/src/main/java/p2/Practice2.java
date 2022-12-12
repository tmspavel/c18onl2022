package p2;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

public class Practice2 {
    public static void main(String[] args) {
        String s3 = new String("qwerty");
        String s4 = new String(new char[]{'s', 't', 'r', 'i', 'n', 'g'});

        s4 = "";
        System.out.println(s4 != null && s4.isEmpty());
//        System.out.println(s4.isBlank());

        String str = "         ";
        if (isNotBlank(str)) {
            System.out.println("1221");
        }


        s4 = "    ";
        System.out.println(s4.isEmpty());
//        System.out.println(s4.isBlank());
        s4 = "    f";
//        System.out.println(s4.isBlank());

        s4 = null;
//        System.out.println(s4.isEmpty());//
//        System.out.println(s4 != null && s4.isBlank());


        //проверка на null

    }
}
