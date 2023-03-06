package structural.adapter;

public class MainAdapter {

    public static void main(String[] args) {
        structural.adapter.DataBase dataBase = new structural.adapter.AdapterJavaAppToDataBase();
        dataBase.create();
        dataBase.read();
        dataBase.update();
        dataBase.delete();
    }
}
