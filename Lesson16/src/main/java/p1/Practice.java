package p1;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Practice {
    @AllArgsConstructor
    static class Data {
        private Integer value;
        private String str;
        private Practice practice;
    }

    public static void main(String[] args) {
        List<String> list = new LinkedList<>(); //generics

        ArrayList<Data> listInteger = new ArrayList<>();
        listInteger.add(new Data(12, "234", new Practice()));


        for (Data object : listInteger) {
//            if (object instanceof String) {
//                String trim = ((String) object).trim();
//            }
            String str = object.str.trim();
        }


        ArrayList<String> ss = new ArrayList<>();
        ss.add("12");


        List<Integer> objList = new ArrayList<>();
//        objList.add("asd");
        objList.add(12);
//        objList.add(new Practice().toString());

        System.out.println((Integer) objList.get(0) + "" + (Integer) objList.get(1));

        //interface
        List<Marker> markers = new ArrayList<>();
        markers.add(new M1());
        markers.add(null);
        markers.add(new M2());

        for (Marker marker : markers) {
            if (marker != null) {
                marker.test();
            }
        }

        String s = markers.stream()
                .filter(Objects::nonNull)
                .map(Marker::toString)
                .findFirst()
                .get();
        System.out.println(s);
        //.test();// не забываем про оформления кода!
    }


}
