package by.teachmeskills.eshop.controller;

import by.teachmeskills.eshop.model.Command;
import by.teachmeskills.eshop.utils.CommandControllerFactory;

public class Main {

    public static void main(String[] args) throws Exception {
        try {
            for (Command command : Command.values()) {
                BaseCommandController baseController = CommandControllerFactory.defineCommand(command);
                baseController.execute(null);
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
//        Test homeController = new Test();
//
//        Method setCategoryService = homeController.getClass().getMethod("setCategoryService", CategoryService.class);
//        setCategoryService.invoke(homeController, new CategoryServiceImpl(new StaticCategoryRepositoryImpl()));
//        System.out.println(homeController.getCategoryService().getCategories());
    }

}
