package com.unicauca.my_food.domain.inventory.value_objects;

import lombok.Getter;

@Getter
public class Stock {
    private int amount;

    public Stock(int amount) {
        // Verifica que sea un valor válido
        if (amount < 0)
            throw new IllegalArgumentException("The stock can't be negative");
        this.amount = amount;
    }
}
