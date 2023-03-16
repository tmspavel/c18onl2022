package by.teachmeskills.logging.log4j;

import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;

@Slf4j //используем анатацию ломбок для того что бы не делать переменную Logger внутри класса!!!
public class Order {

    public void doOrder() {
        MDC.put("conversation", UUID.randomUUID().toString());

        log.info("Trying to add product to shopping cart...");
        try {
            addToCart();
        } catch (Exception e) {
            log.error("Unexpected error", e);
        }
        log.info("Order created");

        MDC.remove("conversation");
    }


    private void addToCart() throws Exception {
        log.warn("Check product list is not empty before adding!");
        log.info("Product added to shopping cart");
        log.error("Some error occurred after adding the product to shopping cart");
        throw new IllegalStateException("IllegalStateException");
    }
}

