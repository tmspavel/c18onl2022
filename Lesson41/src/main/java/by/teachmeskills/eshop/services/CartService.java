package by.teachmeskills.eshop.services;

import static by.teachmeskills.eshop.EshopConstants.SHOPPING_CART;
import static by.teachmeskills.eshop.PagesPathEnum.CART_PAGE;
import static by.teachmeskills.eshop.RequestParamsEnum.PRODUCT;

import by.teachmeskills.eshop.entities.Cart;
import by.teachmeskills.eshop.entities.Product;
import by.teachmeskills.eshop.repositories.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

@Service
public class CartService {

    private final ProductRepository productRepository;

    public CartService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ModelAndView addProductToCart(int productId, Cart shopCart) {
        ModelMap modelParams = new ModelMap();

        Product product = productRepository.findById(productId);
        shopCart.addProduct(product);

        modelParams.addAttribute(PRODUCT.getValue(), product);
        modelParams.addAttribute(SHOPPING_CART, shopCart);

        return new ModelAndView(CART_PAGE.getPath(), modelParams);
    }
}
