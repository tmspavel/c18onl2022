package by.teachmeskills.logging.log4j;

import java.util.Objects;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Order {

    private final static Logger log = LogManager.getLogger(Order.class);

    private final Long id;
    private final String name;
    private int hashCode;

    public Order(Long id, String name) {
        this.id = id;
        this.name = name;
    }

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

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        return Objects.equals(id, order.id) && Objects.equals(name, order.name);
    }

//    @Override
//    public int hashCode() {
//        if (hashCode == 0) {
//            if (id == null || name == null) {
//                hashCode = super.hashCode();
//            } else {
//                int result = id.hashCode();
//                result = 31 * result + name.hashCode();
//                hashCode = result;
//            }
//        }
//        return hashCode;
//    }


    @Override
    public int hashCode() {
        if (hashCode == 0) {
            hashCode = Objects.hash(id, name);
        }
        return hashCode;
    }
}

