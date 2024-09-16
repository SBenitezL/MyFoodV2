package com.unicauca.my_food.domain.order_consumption.service;

import org.springframework.stereotype.Service;

import com.unicauca.my_food.domain.order_consumption.Order;
import com.unicauca.my_food.domain.order_consumption.value_objects.Dish;
import com.unicauca.my_food.domain.order_consumption.value_objects.Ingredient;

import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
public class OrderDomainService implements IOrderDomainService{
    private final int MAX_STATE_AVAIBLE = 2;

    @Override
    public boolean changeOrderState(Order order, int state) {
        if(state > MAX_STATE_AVAIBLE)
            return false;
        
        return order.changeState(state);
    }

    @Override
    public boolean addDish(Order order, Dish dish) {
        if(dish == null)
            return false;
        
        return order.addDish(dish);
    }

    @Override
    public boolean removeDish(Order order, String id) {
        if(id.isBlank())
            return false;
        
        return order.removeDish(id);
    }

    @Override
    public boolean addIngredient(Dish dish, Ingredient ingredient) {
        if(dish == null || ingredient == null)
            return false;
        
        return dish.addIngredient(ingredient);
    }

    @Override
    public boolean removeIngredient(Dish dish, String idIngredient) {
        if(dish == null ||  idIngredient.isBlank())
            return false;
        
            return dish.removeIngredient(idIngredient);
    }

    @Override
    public String getOrderDate(Order order) {
        if(order == null)
            return "error: order null";

        return order.getDate().getOrderDate();
    }

    @Override
    public String getOrderHour(Order order) {
        if(order == null)
            return "error: order null";

        return order.getDate().getOrderDate();
    }

    @Override
    public boolean calculateTotalPrice(Order order) {
        if(order == null)
            return false;
        
        if(order.getDishes() == null)
            return false;

        return order.getTotalPrice().calculateTotalPrice(order.getDishes());
    }
}
