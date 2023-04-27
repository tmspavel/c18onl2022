package by.teachmeskills.springbootexample.controllers;

import static by.teachmeskills.springbootexample.model.EshopConstants.PRODUCT_ID_PARAM;
import static by.teachmeskills.springbootexample.model.EshopConstants.SHOPPING_CART;
import static by.teachmeskills.springbootexample.model.PagesPathEnum.CART_PAGE;

import by.teachmeskills.springbootexample.entities.Cart;
import by.teachmeskills.springbootexample.services.CartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@RestController
@SessionAttributes({SHOPPING_CART})
@RequestMapping("/cart")
public class CartController {

    private static final String SHOPPING_CART = "cart";
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/add")
    public ModelAndView addProductToCart(@RequestParam(PRODUCT_ID_PARAM) String id, @ModelAttribute(SHOPPING_CART) Cart shopCart) {
        int productId = Integer.parseInt(id);
        return cartService.addProductToCart(productId, shopCart);
    }

    @GetMapping("/open")
    public ModelAndView redirectToShoppingCart() {
        return new ModelAndView(CART_PAGE.getPath());
    }

    @ModelAttribute(SHOPPING_CART)
    public Cart shoppingCart() {
        return new Cart();
    }
}
