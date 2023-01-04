package by.tms.service;

import by.tms.model.Product;
import by.tms.model.Shop;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ServiceShop implements ServiceShopAware {

    private Shop shop;

    @Override
    public boolean add(Product product) {
        if (!shop.getProducts().contains(product)) {
            return shop.getProducts().add(product);
        }
        return false;
    }

    @Override
    public boolean delete(Product product) {
//        Iterator<Product> iterator = shop.getProducts().iterator();
//        while (iterator.hasNext()) {
//            Product productForDelete = iterator.next();
//            if (productForDelete.equals(product)) {
//                iterator.remove();
//                return true;
//            }
//        }
//        return false;
        return shop.getProducts().removeIf(p -> p.equals(product));
    }

    @Override
    public void edit(long id, Product product) {
        for (Product shopProduct : shop.getProducts()) {
            if (shopProduct.getId() == id) {
                shopProduct.setName(product.getName());
                break;
            }
        }
//        Optional<Product> first = shop.getProducts().stream()
//                .filter(shopProduct -> shopProduct.getId() == id)
//                .findFirst();
//        if (first.isPresent()) {
//            Product productResult = first.get();
//            productResult.setName(product.getName());
//        }

        shop.getProducts().stream()
                .filter(shopProduct -> shopProduct.getId() == id)
                .findFirst()
                .ifPresent(p -> modify(p, product));
    }

    @Override
    public List<Product> getProducts() {
        return shop.getProducts();
    }

    private void modify(Product expected, Product actual) {
        expected.setName(actual.getName());
    }
}
