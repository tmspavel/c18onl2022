package facade;

public class GPSFacade {

    private GPSPower power;
    private GPSNotifier notifier;
    private RoadAdvisor advisor;

    public GPSFacade(GPSPower power, GPSNotifier notifier, RoadAdvisor advisor) {
        this.power = power;
        this.notifier = notifier;
        this.advisor = advisor;
    }

    public void activate() {
        power.powerOn();
        notifier.downloadRoadInfo();
        advisor.route();
    }
}

