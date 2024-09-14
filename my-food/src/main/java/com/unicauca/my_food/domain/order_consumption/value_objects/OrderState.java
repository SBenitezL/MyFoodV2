package com.unicauca.my_food.domain.order_consumption.value_objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderState {
    private String id;
    private String state;
}
