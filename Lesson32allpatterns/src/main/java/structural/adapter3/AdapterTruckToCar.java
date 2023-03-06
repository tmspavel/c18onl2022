package structural.adapter3;

public class AdapterTruckToCar implements Car {

    private structural.adapter3.MyTrack myTrack;

    public AdapterTruckToCar(structural.adapter3.MyTrack myTrack) {
        this.myTrack = myTrack;
    }


    @Override
    public void washCar() {
        myTrack.cleanTruck();
    }
}
