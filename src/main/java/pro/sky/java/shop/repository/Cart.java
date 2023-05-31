package pro.sky.java.shop.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Repository
@SessionScope
public class Cart {

    private final List<Integer> cart = new ArrayList<>();

    public void add(Integer ... id){
        cart.addAll(Arrays.asList(id));
    }

    public List<Integer> get(){
        return Collections.unmodifiableList(cart);
    }
}
