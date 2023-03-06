package adapter;

public class Stock {

    public String getQuotationInXml() {
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<quotation id = 1>\n" +
                "<date>11.05.2022</date>\n" +
                "<currency>USD</currency>\n" +
                "<amount>100</amount>\n" +
                "</quotation>";
    }
}
