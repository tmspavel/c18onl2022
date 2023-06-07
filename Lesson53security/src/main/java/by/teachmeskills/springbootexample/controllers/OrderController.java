package by.teachmeskills.springbootexample.controllers;

import by.teachmeskills.springbootexample.services.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/create")
    public void createOrder() {
        orderService.createOrder();
    }

    @GetMapping("/create/view")
    public ModelAndView createOrderWithView() {
        return new ModelAndView("/order.html");
    }
}
