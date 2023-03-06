package adapter;

public class AnalyticsApp {

    public static void main(String[] args) {
        adapter.DataProvider dataProvider = new adapter.JsonDataProviderAdapter(new adapter.Stock());
        String data = dataProvider.provideData();
        System.out.println("JSON analytics report: \n" + data);
    }
}
