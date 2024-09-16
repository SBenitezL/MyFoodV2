package com.unicauca.my_food.domain.waste;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.unicauca.my_food.domain.inventory.Product;
import com.unicauca.my_food.domain.waste.value_objects.CauseWaste;
import com.unicauca.my_food.domain.waste.value_objects.QuantityWaste;

import lombok.Getter;

@Getter
public class Waste {
    private String idWaste;
    private String productId;
    private QuantityWaste quantyWaste;
    private CauseWaste cause;
    private Date dateRegister; 
    private List<Product> productsWaste;

    public Waste(Product product, double quantityWaste, CauseWaste cause){
        this.idWaste = UUID.randomUUID().toString();
        this.productId = product.getId();
        this.quantyWaste = new QuantityWaste(quantityWaste);
        this.cause = cause;
        this.dateRegister = new Date();
        this.productsWaste = new ArrayList<>();
    }

    public void registerWaste(){
        this.quantyWaste.addQuantity(this.quantyWaste.getWasteQuantity());
    }

    public double calculateImpact(){
        //TODO
        return 0;
    }

    public void suggestReductionMeasures(){
        //TODO
    }
}


