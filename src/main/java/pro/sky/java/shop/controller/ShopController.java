package pro.sky.java.shop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.shop.service.ShopService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class ShopController {

    private final ShopService shopService;

    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping("/add")
    public void add(@RequestParam Integer... id) {
        shopService.add(id);
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return shopService.get();
    }
}
