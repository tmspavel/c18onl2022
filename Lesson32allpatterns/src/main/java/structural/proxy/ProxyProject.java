package structural.proxy;

public class ProxyProject implements Project {

    private String url;
    private structural.proxy.RealProject realProject;

    public ProxyProject(String url) {
        this.url = url;
    }

    @Override
    public void runProject() {
        if (realProject == null) {
            realProject = new structural.proxy.RealProject(url);
        }
        realProject.runProject();
    }
}
