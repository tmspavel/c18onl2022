package by.teachmeskills.eshop.controller;

import by.teachmeskills.eshop.service.CategoryService;

public class Test {

    private CategoryService categoryService;

    public void setCategoryService(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    public CategoryService getCategoryService() {

        return categoryService;
    }
}
