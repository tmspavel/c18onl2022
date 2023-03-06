package adapter;

public class JsonDataProviderAdapter implements adapter.DataProvider {

    private adapter.Stock stock;

    public JsonDataProviderAdapter(adapter.Stock stock) {
        this.stock = stock;
    }

    @Override
    public String provideData() {
        String xml = stock.getQuotationInXml();
        System.out.println("Xml data: " + xml);
        return "{\"quotation_id\": 1, \"date\":\"05.04.2022\", \"currency\":\"USD\", \"amount\":100}";
    }
}
