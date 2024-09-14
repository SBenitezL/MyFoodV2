package com.unicauca.my_food.domain.waste;

import java.util.Date;

import com.unicauca.my_food.domain.inventory.Product;
import com.unicauca.my_food.domain.waste.value_objects.CauseWaste;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Waste {
    private String idWaste;
    private Product productId;
    private long quantyWaste;
    private CauseWaste cause;
    private Date dateRegister; 
}
