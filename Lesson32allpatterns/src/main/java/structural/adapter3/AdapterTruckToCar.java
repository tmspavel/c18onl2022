package by.home.structural.adapter3;

public class AdapterTruckToCar implements Car {

    private by.home.structural.adapter3.MyTrack myTrack;

    public AdapterTruckToCar(by.home.structural.adapter3.MyTrack myTrack) {
        this.myTrack = myTrack;
    }


    @Override
    public void washCar() {
        myTrack.cleanTruck();
    }
}
