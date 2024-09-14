package com.unicauca.my_food.domain.order_consumption.value_objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TotalPrice {
    private String id;
    private double totalPrice;
}
