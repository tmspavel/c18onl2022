package by.home.behavioral.memento;

import java.util.Date;

public class Project {

    private String version;
    private Date date;

    public void setVersionAndDate(String version) {
        this.version = version;
        this.date = new Date();
    }

    public by.home.behavioral.memento.Save save() {
        return new by.home.behavioral.memento.Save(version);
    }

    public void load(by.home.behavioral.memento.Save save) {
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
