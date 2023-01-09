package com.home;

import com.home.exception.ProductAlreadyExistException;
import com.home.model.Product;
import com.home.model.Shop;
import com.home.service.ShopService;
import com.home.service.ShopServiceImpl;
import com.home.service.ShopUIService;
import com.home.service.ShopUIServiceImpl;
import com.home.util.InputUtils;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class HomeWork {
    private static ShopService shopService;

    public static void main(String[] args) {
        Shop shop = new Shop();
        shopService = new ShopServiceImpl(shop);
        ShopUIService ui = new ShopUIServiceImpl(shopService);
        init();
        while (shopService.isWorking()) {
            ui.openShop();
            if (shopService.isWorking()) {
                InputUtils.waitEnterKeyPressed();
            }
        }
        System.out.println("Магазин закрыт!!!");
    }

    private static void init() {
        List<Product> list = List.of(
                Product.builder().id(1).name("Хлеб").price(10).build(),
                Product.builder().id(3).name("Молоко").price(15).build(),
                Product.builder().id(2).name("Масло").price(20).build(),
                Product.builder().id(5).name("Торт").price(60).build(),
                Product.builder().id(4).name("Творог").price(30).build()
        );
        for (Product product : list) {
            try {
                shopService.takeProduct(product);
            } catch (ProductAlreadyExistException e) {
//                log.error(e.getMessage());
            }
        }
    }
}
