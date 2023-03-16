package by.teachmeskills.logging;

import by.teachmeskills.logging.log4j.Order;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class App {

    private final static Logger log = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        Object order = new Order(1L, "заказ 1");
        ((Order) order).doOrder();
        log.info("1233");
        Order order1 = new Order(2L, "заказ 2");

        Order order2 = new Order(3L, "заказ 3");

        List<Order> orderList = new ArrayList<>();
        orderList.add(order1);
        orderList.add(order2);

        boolean checkOrder = checkOrder(orderList, new Order(2L, "заказ 2"));

        System.out.println(checkOrder);

//        System.out.println(new Order().hashCode());

        Map<Order, String> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put(order1, "заказ 2");
        objectObjectHashMap.put(order2, "заказ 3");

        System.out.println(objectObjectHashMap.get(order1));
        System.out.println(objectObjectHashMap.get(order2));


    }

    private static boolean checkOrder(List<Order> orderList, Order order) {
        return orderList.contains(order);
    }

}
