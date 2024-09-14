package com.unicauca.my_food.domain.waste.value_objects;

import com.unicauca.my_food.domain.inventory.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductWaste {
    private Product productId;
    private String nameProduct;
}
