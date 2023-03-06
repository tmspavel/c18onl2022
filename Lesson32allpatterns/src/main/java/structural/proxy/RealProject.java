package structural.proxy;

public class RealProject implements Project {

    private String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }

    private void load() {
        System.out.println("Project loaded from " + url);
    }

    @Override
    public void runProject() {
        System.out.println("Project run from " + url);
    }
}
