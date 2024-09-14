package com.unicauca.my_food.domain.inventory;

import java.util.Date;
import java.util.Locale.Category;

import com.unicauca.my_food.domain.inventory.service.IProduct;
import com.unicauca.my_food.domain.inventory.value_objects.ProductName;
import com.unicauca.my_food.domain.inventory.value_objects.Stock;
import com.unicauca.my_food.domain.inventory.value_objects.Units;

public class Product implements IProduct {
    private String id;
    private ProductName name;
    private Category category;
    private Stock stock;
    private Units unit;
    private Date usefulLife;
    private boolean isExpired;

    @Override
    public boolean decreaseStock(int amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'decreaseStock'");
    }

    @Override
    public boolean markExpired() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'markExpired'");
    }

    @Override
    public boolean increaseStock(int amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'increaseStock'");
    }

}
