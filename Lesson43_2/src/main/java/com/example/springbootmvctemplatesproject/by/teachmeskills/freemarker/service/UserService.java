package com.example.springbootmvctemplatesproject.by.teachmeskills.freemarker.service;

import com.example.springbootmvctemplatesproject.by.teachmeskills.freemarker.model.User;
import com.example.springbootmvctemplatesproject.by.teachmeskills.freemarker.repository.OrderRepository;
import com.example.springbootmvctemplatesproject.by.teachmeskills.freemarker.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final OrderRepository orderRepository;

    public UserService(UserRepository userRepository, OrderRepository orderRepository) {
        this.userRepository = userRepository;
        this.orderRepository = orderRepository;
    }

    public ModelAndView getUserInfo() {
        ModelMap model = new ModelMap();
        User user = userRepository.getUser();
        user.setOrders(orderRepository.getOrders());
        model.addAttribute("user", user);
        return new ModelAndView("profile2", model);
    }
}
