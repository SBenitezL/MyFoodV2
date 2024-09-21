package com.unicauca.my_food.application.inventory;

import java.util.List;

import com.unicauca.my_food.domain.inventory.Product;

public interface IInventoryService {
    Product save(Product product);

    Product update(Product product);

    Product delete(String id);

    List<Product> productsExpired();

    Product increase(String id, int amount);

    Product decrease(String id, int amount);

    void markExpired();

}
