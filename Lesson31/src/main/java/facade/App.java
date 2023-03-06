package facade;

public class App {

    public static void main(String[] args) {
        GPSPower power = new GPSPower();
        GPSNotifier notifier = new GPSNotifier();
        RoadAdvisor advisor = new RoadAdvisor();

        GPSFacade gps = new GPSFacade(power, notifier, advisor);

        //Driver turns on navigations system
        gps.activate();
        //Driver turns off navigations system
        power.powerOff();

    }
}
