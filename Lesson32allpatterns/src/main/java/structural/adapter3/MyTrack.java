package structural.adapter3;

public class MyTrack implements structural.adapter3.Truck {

    @Override
    public void cleanTruck() {
        System.out.println("My truck is cleaning");
    }
}
