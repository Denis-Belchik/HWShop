package pro.sky.java.shop.service;

import java.util.List;

public interface ShopService {
    void add(Integer... id);
    List<Integer> get();
}
