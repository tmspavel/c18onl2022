package by.teachmeskills.eshop;

public enum RequestParamsEnum {
    LOGIN("username"),
    PASSWORD("password"),
    COMMAND("command"),
    SHOPPING_CART("cart"),
    PRODUCT("product"),
    SHOPPING_CART_PRODUCTS("cartProductsList"),
    POPULAR_CATEGORIES_LIST_REQ_PARAM("categories"),
    CATEGORY_PARAM("category"),
    PRODUCT_ID("product_id");

    private final String value;

    RequestParamsEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

