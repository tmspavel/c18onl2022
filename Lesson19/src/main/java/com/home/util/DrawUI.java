package com.home.util;

import com.home.form.ProductForm;

public class DrawUI {

    public static void drawStartMenu() {
        System.out.println("************************************************************");
        System.out.println("*              ДОБРО ПОЖАЛОВАТЬ В НАШ МАГАЗИН              *");
        System.out.println("*                                                          *");
        System.out.println("*              выберите один из пунктов меню               *");
        System.out.println("************************************************************");
        System.out.println("1 - Получить список всех товаров");
        System.out.println("2 - Добавить новый товар");
        System.out.println("3 - Редактировать существующий товар");
        System.out.println("4 - Удалить товар");
        System.out.println("5 - Закрыть магазин");

    }

    public static void drawSortingProductsMenu() {
        System.out.println("************************************************************");
        System.out.println("*              Выберите параметр сортировки                *");
        System.out.println("************************************************************");
        System.out.println("1 - Id");
        System.out.println("2 - Наименование");
        System.out.println("3 - Цена (по-возрастанию)");
        System.out.println("4 - Цена (по-убыванию)");
        System.out.println("5 - Времени добавления");
        System.out.println("6 - Назад, в главное меню");
    }

    public static void drawAddProductMenu() {
        System.out.println("************************************************************");
        System.out.println("*             Задайте параметры нового товара              *");
        System.out.println("************************************************************");
    }

    public static void drawSelectIdProductMenu() {
        System.out.println("************************************************************");
        System.out.println("*                   Задайте ID товара                      *");
        System.out.println("************************************************************");
    }

    public static void drawEditProductMenu(ProductForm form) {
        System.out.println("************************************************************");
        System.out.println("*          Измените параметры существующего товара         *");
        System.out.println("*>     ID           : " + form.getId() + ";");
        System.out.println("*>     Наименование : " + form.getName() + ";");
        System.out.println("*>     Цена         : " + form.getPrice() + ";");
        System.out.println("************************************************************");
    }

    public static void drawDeleteProductMenu(ProductForm form) {
        System.out.println("************************************************************");
        System.out.println("*                  Вы хотите удалить товар?                *");
        System.out.println("*>     ID           : " + form.getId() + ";");
        System.out.println("*>     Наименование : " + form.getName() + ";");
        System.out.println("*>     Цена         : " + form.getPrice() + ";");
        System.out.println("************************************************************");
        System.out.println("1 - Удалить");
        System.out.println("2 - Назад, в главное меню");
    }
}
