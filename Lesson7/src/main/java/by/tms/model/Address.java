package by.tms.model;

public class Address {

    private String country;

    private String city;

    public Address(String city) {
        this.city = city;
//        while (true) { так делать нельзя!!!
//            System.out.println("sdfsdf");
//        }
    }

    public Address(String country, String city) {
        this.country = country;
        this.city = city;
    }

//    @Override
//    public String toString() {
//        return country + " " + city;
//    }


    @Override
    public String toString() {
        return "Address[" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ']';
    }
}
