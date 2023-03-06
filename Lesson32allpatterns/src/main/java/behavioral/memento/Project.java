package behavioral.memento;

import java.util.Date;

public class Project {

    private String version;
    private Date date;

    public void setVersionAndDate(String version) {
        this.version = version;
        this.date = new Date();
    }

    public behavioral.memento.Save save() {
        return new behavioral.memento.Save(version);
    }

    public void load(behavioral.memento.Save save) {
        version = save.getVersion();
        date = save.getDate();
    }

    @Override
    public String toString() {
        return "\nProject:" +
                "\nVersion=" + version +
                "\nDate=" + date +
                "\n";
    }
}
