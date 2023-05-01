package by.teachmeskills.springbootexample.model;

public enum PagesPathEnum {
    START_PAGE("home"),
    SIGN_IN_PAGE("signin"),
    CATEGORY_PAGE("category"),
    CART_PAGE("cart"),
    PRODUCT_PAGE("product"),
    ERROR_PAGE("error");

    private final String path;

    PagesPathEnum(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}

