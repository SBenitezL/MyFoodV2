package com.unicauca.my_food.application.waste;

import java.util.List;

import com.unicauca.my_food.domain.waste.Waste;

public interface IWasteService {
    public Waste createWaste(Waste waste);
    public Waste getWasteById(String wasteId);
    public List<Waste> getAllWaste();
    public void updateWaste(String wasteId, Waste waste);
    public void deleteWaste(String wasteId);
    public void registerWaste(String wasteId, double quantity);
    void suggestReductionMeasures(String wasteId);
}
