import by.tms.model.Product;
import by.tms.model.Shop;
import by.tms.service.ServiceShop;
import by.tms.service.ServiceShopAware;

public class Main {
    public static void main(String[] args) {
        ServiceShopAware serviceShop = new ServiceShop(new Shop());
        serviceShop.add(new Product(1L, "sdf"));
        serviceShop.add(new Product(3L, "sdf"));
        serviceShop.add(new Product(4L, "sddf"));
        System.out.println(serviceShop.getProducts());
    }
}
