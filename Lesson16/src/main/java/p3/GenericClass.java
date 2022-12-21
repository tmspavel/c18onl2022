package p3;


import java.util.List;

public class GenericClass<T> {

//    private static T value;//  нельзя? статика принадлежит классу.

    public <A> A getValue(Object obj) {
//        new A(); //нельзя
        return (A) obj;
    }

    public String getValue1(Object obj) {
        //new A(); //нельзя
        return (String) obj;
    }

    /**
     * Object
     * - Transport
     * -- AirTransport
     * --- Military
     * <p>
     * extends - ниже AirTransport включая его (AirTransport, Military)
     *
     * @param list
     */
    public void listExtendsExample(List<? extends Number> list) {
//        System.out.println(list.get(0).getBrand());
//        list.add(1);//compilation error
//        Object integer = new Integer(1);
//        Number number = 12;
//        list.add(number);
//        Transport sd = new Transport(2.3, 2.3, 3.5, "sd");
//        AirTransport airTransport = AirTransport.builder().build();
//        list.add(airTransport);
    }


    /**
     * Object
     * - Transport
     * -- AirTransport
     * --- Military
     * <p>
     * super - выше AirTransport (AirTransport, Transport, Object)
     *
     * @param list
     */
    public void listSupersExample(List<? super Number> list) {
        list.add(11);
        list.add(23.23);
        System.out.println(((Number) list.get(0)).intValue());
    }
}
