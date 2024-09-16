package com.unicauca.my_food.domain.waste.value_objects;

import com.unicauca.my_food.domain.inventory.Product;
import com.unicauca.my_food.domain.inventory.value_objects.ProductName;

import lombok.Getter;

    @Getter
    public class ProductWaste {
        private Product product;
        private String productWasteId;
        private ProductName nameProductWaste;

        public ProductWaste(Product product){
            this.product = product;
            this.productWasteId = this.product.getId(); //Revisar
            this.nameProductWaste = this.product.getName();
        }
        
        public String getDetailsProduct(){
            return String.format("ID: %s, Nombre: %s, Categoria: %s, Stock %d",
                                        product.getId(), 
                                        product.getName().getName(), 
                                        product.getCategory(),
                                        product.getStock().getAmount());
        }
    }
