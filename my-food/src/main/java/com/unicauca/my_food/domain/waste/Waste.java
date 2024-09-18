package com.unicauca.my_food.domain.waste;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.unicauca.my_food.domain.inventory.Product;
import com.unicauca.my_food.domain.waste.service.IReductionSuggester;
import com.unicauca.my_food.domain.waste.service.WasteReductionSuggester;
import com.unicauca.my_food.domain.waste.value_objects.CauseWaste;
import com.unicauca.my_food.domain.waste.value_objects.QuantityWaste;

import lombok.Getter;

@Getter
public class Waste {
    private String idWaste;
    private String productId;
    private QuantityWaste quantityWaste;
    private CauseWaste cause;
    private Date dateRegister; 
    private List<Product> productsWaste;

    public Waste(Product product, double quantityWaste, CauseWaste cause){
        this.idWaste = UUID.randomUUID().toString();
        this.productId = product.getId();
        this.quantityWaste = new QuantityWaste(0);
        this.cause = cause;
        this.dateRegister = new Date();
        this.productsWaste = new ArrayList<>();
    }

    public void registerWaste(double quantity){
        if(quantity > 0)
            this.quantityWaste.addQuantity(quantity);
        else
            throw new IllegalArgumentException("La cantidad de desperdicio debe ser positiva.");
    }

    public void suggestReductionMeasures(IReductionSuggester suggester){
        String suggestions = suggester.suggest(this);
        System.out.println(suggestions);
    }
}


