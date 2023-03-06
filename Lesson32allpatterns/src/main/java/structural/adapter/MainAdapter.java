package by.home.structural.adapter;

public class MainAdapter {

    public static void main(String[] args) {
        by.home.structural.adapter.DataBase dataBase = new by.home.structural.adapter.AdapterJavaAppToDataBase();
        dataBase.create();
        dataBase.read();
        dataBase.update();
        dataBase.delete();
    }
}
