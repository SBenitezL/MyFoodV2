package com.unicauca.my_food.domain.order_consumption.value_objects;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dish {
    private String id;
    private String name;
    private List<Ingredient> ingredients;
    private Double price;
}
