package pro.sky.java.shop.service;

import org.springframework.stereotype.Service;
import pro.sky.java.shop.repository.Cart;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService{

    private final Cart cart;

    public ShopServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void add(Integer... id) {
        cart.add(id);
    }

    @Override
    public List<Integer> get() {
        return cart.get();
    }
}
