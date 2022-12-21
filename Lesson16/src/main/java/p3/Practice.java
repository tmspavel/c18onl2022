package p3;

import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
//        ArrayList<Integer> list1 = new ArrayList<>();
        GenericClass<Number> integerGenericClass = new GenericClass<>();
//
//
//        new Long(12);

//        Person value = integerGenericClass.getValue(12);
//        System.out.println(value.toString());

//
//
//        List<AirTransport> listExtends = new LinkedList<>();
////        listExtends.add(new Object());
//        integerGenericClass.listExtendsExample(listExtends);
////
//        List<AirTransport> list = new LinkedList<>();
////        list.add(11);
//        integerGenericClass.listSupersExample(list);
//
//
        NewIntegerGeneric newGeneric = new NewIntegerGeneric();
        System.out.println(newGeneric.<Long>getValue(123));
        System.out.println(newGeneric.<Long>getValue(123L));

        ArrayList<Number> people = new ArrayList<>();
        newGeneric.listExtendsExample(people);

    }
}
