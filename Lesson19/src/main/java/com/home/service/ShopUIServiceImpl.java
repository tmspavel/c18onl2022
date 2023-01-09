package com.home.service;

import com.home.exception.ProductAlreadyExistException;
import com.home.form.ProductForm;
import com.home.model.Product;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import static com.home.form.ProductForm.fromGood;
import static com.home.form.ProductForm.toGood;
import static com.home.util.DrawUI.*;
import static com.home.util.InputUtils.readIntFromConsole;
import static com.home.util.InputUtils.readStringFromConsole;
import static java.util.Collections.reverse;
import static java.util.Comparator.comparing;

@Slf4j
public class ShopUIServiceImpl implements ShopUIService {
    private final ShopService service;

    public ShopUIServiceImpl(ShopService service) {
        this.service = service;
    }

    @Override
    public void openShop() {
        startPage();
    }

    private void startPage() {
        drawStartMenu();
        int bound = 5;
        int menuPoint = readIntFromConsole("Введите число от 1 до " + bound, bound);
        switch (menuPoint) {
            case 1:
                sortingPage();
                break;
            case 2:
                addProductPage();
                break;
            case 3:
                editProductPage();
                break;
            case 4:
                deleteProductPage();
                break;
            case 5:
                service.closeShop();
                break;
        }
    }

    private void sortingPage() {
        drawSortingProductsMenu();
        int bound = 6;
        int menuPoint = readIntFromConsole("Введите число от 1 до " + bound, bound);
        List<Product> allProducts = service.getAllProducts();
        switch (menuPoint) {
            case 1:
                printProductsList(sortListById(allProducts), "ID");
                break;
            case 2:
                printProductsList(sortListByName(allProducts), "Наименование");
                break;
            case 3:
                printProductsList(sortListByPriceAsс(allProducts), "Цена по-возрастанию");
                break;
            case 4:
                printProductsList(sortListByPriceDesс(allProducts), "Цена по-убыванию");
                break;
            case 5:
                printProductsList(sortListByAdd(allProducts), "По порядку добавления");
                break;
            case 6:
                startPage();
                break;
        }
    }

    private void addProductPage() {
        drawAddProductMenu();
        try {
            ProductForm form = createProductForm();
            service.takeProduct(toGood(form));
            System.out.println("*** Товар добавлен");
        } catch (ProductAlreadyExistException e) {
            System.out.println(e.getMessage());
//            log.error(e.getMessage());
            startPage();
        }
    }

    private void editProductPage() {
        drawSelectIdProductMenu();
        int selectId = readIntFromConsole("Введите Id товара", Integer.MAX_VALUE);
        try {
            Product product = service.getProductById(selectId);
            drawEditProductMenu(fromGood(product));
            ProductForm form = createProductForm();
            service.editProduct(product.getId(), toGood(form));
            System.out.println("*** Товар изменен");
        } catch (NoSuchElementException | ProductAlreadyExistException e) {
            System.out.println(e.getMessage());
//            log.error(e.getMessage());
            startPage();
        }
    }

    private void deleteProductPage() {
        drawSelectIdProductMenu();
        int selectId = readIntFromConsole("Введите Id товара", Integer.MAX_VALUE);
        try {
            Product product = service.getProductById(selectId);
            drawDeleteProductMenu(fromGood(product));
            int bound = 2;
            int menuPoint = readIntFromConsole("Введите число от 1 до " + bound, bound);
            switch (menuPoint) {
                case 1:
                    service.removeProduct(product.getId());
                    System.out.println("*** Товар удален");
                    break;
                case 2:
                    startPage();
                    break;
            }
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
//            log.error(e.getMessage());
            startPage();
        }
    }

    private ProductForm createProductForm() {
        return ProductForm.builder()
                .id(readIntFromConsole("Задайте Id товара", Integer.MAX_VALUE))
                .name(readStringFromConsole("Задайте наименование товара"))
                .price(readIntFromConsole("Задайте цену товара", Integer.MAX_VALUE))
                .build();
    }

    private List<Product> sortListByName(List<Product> list) {
        return list.stream()
                .sorted(comparing(a -> a.getName().toUpperCase()))
                .collect(Collectors.toList());
    }

    private List<Product> sortListById(List<Product> list) {
        return list.stream().sorted(comparing(Product::getId)).collect(Collectors.toList());
    }

    private List<Product> sortListByPriceAsс(List<Product> list) {
        return list.stream()
                .sorted(comparing(Product::getPrice))
                .collect(Collectors.toList());
    }

    private List<Product> sortListByPriceDesс(List<Product> list) {
        return list.stream()
                .sorted(comparing(Product::getPrice).reversed())
                .collect(Collectors.toList());
    }

    private List<Product> sortListByAdd(List<Product> list) {
        List<Product> reverseList = new ArrayList<>(list);
        reverse(reverseList);
        return reverseList;
    }

    private void printProductsList(List<Product> productList, String sortBy) {
        System.out.printf("***** Список товара в магазине (сортировано по полю: %s).\n", sortBy);
        productList.forEach(System.out::println);
    }
}
