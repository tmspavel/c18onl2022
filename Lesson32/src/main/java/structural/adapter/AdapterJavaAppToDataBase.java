package by.home.structural.adapter;

public class AdapterJavaAppToDataBase extends by.home.structural.adapter.JavaApplication implements by.home.structural.adapter.DataBase {

    @Override
    public void create() {
        createObject();
    }

    @Override
    public void read() {
        readObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void delete() {
        deleteObject();
    }
}
