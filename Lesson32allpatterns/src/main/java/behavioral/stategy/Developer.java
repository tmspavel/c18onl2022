package behavioral.stategy;

public class Developer {

    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity() {
        activity.justDoIt();
    }

    public void justDoIt() {
        activity.justDoIt();
    }
}
