package com.unicauca.my_food.domain.order_consumption;

import java.util.List;

import com.unicauca.my_food.domain.order_consumption.value_objects.Dish;
import com.unicauca.my_food.domain.order_consumption.value_objects.OrderDate;
import com.unicauca.my_food.domain.order_consumption.value_objects.OrderState;
import com.unicauca.my_food.domain.order_consumption.value_objects.TotalPrice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private String id;
    private OrderDate date;
    private OrderState state;
    private List<Dish> dishes;
    private TotalPrice totalPrice;    

}
