package com.unicauca.my_food.domain.waste.service;

import com.unicauca.my_food.domain.waste.Waste;

public interface IReductionSuggester {
    
    String suggest(Waste waste);
}
