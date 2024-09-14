package com.unicauca.my_food.domain.inventory;

import java.util.Date;
import java.util.Locale.Category;

import com.unicauca.my_food.domain.inventory.value_objects.Stock;

public class Product {
    private String id;
    private Category category;
    private Stock stock;
    private Date usefulLife;

}
