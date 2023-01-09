package com.home.service;

import com.home.model.Shop;

public class Main {
    public static void main(String[] args) {
        ShopService shopService = new ShopServiceImpl(new Shop());
        System.out.println(shopService.getAllProducts());
    }
}
