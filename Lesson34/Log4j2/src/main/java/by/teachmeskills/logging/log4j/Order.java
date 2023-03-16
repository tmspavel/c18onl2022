package by.teachmeskills.logging.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Order {

    private final static Logger log = LogManager.getLogger(Order.class);

    public void doOrder() {
        log.info("Trying to add product to shopping cart...");
        addToCart();
        log.info("Order created");
    }

    private void addToCart() {
        log.warn("Check product list is not empty before adding!");
        log.info("Product added to shopping cart");
        log.error("Some error occurred after adding the product to shopping cart");
    }
}

