package p3;

public class Practice {

    public static void main(String[] args) {
        String s3 = new String("qwerty");
        ///////////SB////////////
        StringBuilder s1 = new StringBuilder("sdd" + "sd");

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 1_000_000_000; i++) {
            str.append(i);
        }
        System.out.println(s1.toString());


        StringBuilder sb = new StringBuilder();
        String s2 = sb.append("sdd").append("sd").toString();
        int i = 0;
        while (i < 10) {
            sb.append(++i);
        }
        System.out.println(sb.toString());

        sb = new StringBuilder(10);
        System.out.println(sb.capacity());
        sb = new StringBuilder("asdas");
        sb = new StringBuilder(s3);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.toString());
        System.out.println(sb);

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(23).toString();

        StringBuilder stringBuilder = new StringBuilder();
        String s = stringBuilder
                .append(23)
                .append('e')
                .append(method24444())
                .toString();
        System.out.println(s);


        char[] chars = new char[5];
        sb.getChars(0, 4, chars, 1);
        System.out.println(chars);
        sb.append("asdasd").append(12);
        System.out.println(sb);
        sb.insert(1, "!!!");
        System.out.println(sb);
        sb.delete(1, 4);
        System.out.println(sb);
        System.out.println(sb.reverse());

        sb.setLength(123);
        System.out.println(sb.length());
        sb = new StringBuilder("one two three");
        sb.replace(4, 7, "fouasdasdsdar");

        String substring = sb.substring(3);

        System.out.println(sb.toString());

//        String str = "carbar";
//        str.replaceAll("a", "!");
    }

    private static String method24444() {
        return "asd";
    }
}
