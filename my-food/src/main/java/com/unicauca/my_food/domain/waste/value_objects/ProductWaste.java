package com.unicauca.my_food.domain.waste.value_objects;

import java.util.UUID;

import com.unicauca.my_food.domain.inventory.Product;
import com.unicauca.my_food.domain.inventory.value_objects.ProductName;

import lombok.Getter;

    @Getter
    public class ProductWaste {
        private String productWasteId;
        private Product product;
        private String productId;
        private ProductName nameProduct;

        public ProductWaste(Product product){
            this.productWasteId = UUID.randomUUID().toString();
            this.product = product;
            this.productId = product.getId(); //Revisar
            this.nameProduct = product.getName();
        }
        
        public String getDetailsProduct(){
            return String.format("ID: %s, Nombre: %s, Categoria: %s, Stock %d",
                                        product.getId(), 
                                        product.getName().getName(), 
                                        product.getCategory(),
                                        product.getStock().getAmount());
        }
    }
