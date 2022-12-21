package p4;

public class Account<V extends Number> {
    private String id;
    private V sum;

//    <T extends String, V extends Number> Account(T id, V sum) {
//        this.id = id;
//        this.sum = sum;
//    }


    public Account(String id, V sum) {
        this.id = id;
        this.sum = sum;
    }

    public String getId() {
        return id;
    }

    public V getSum() {
        return sum;
    }

}
