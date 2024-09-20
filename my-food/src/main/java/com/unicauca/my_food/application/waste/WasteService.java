package com.unicauca.my_food.application.waste;

import java.util.List;

import com.unicauca.my_food.domain.waste.Waste;
import com.unicauca.my_food.domain.waste.service.WasteDomainService;
import com.unicauca.my_food.infrastucture.repositories.WasteRepository;

public class WasteService implements IWasteService{
    private final WasteDomainService domainService;
    private final WasteRepository repository;

    public WasteService(WasteDomainService domainService, WasteRepository repository){
        this.repository = repository;
        this.domainService = domainService;
    }

    @Override
    public Waste createWaste(Waste waste) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createWaste'");
    }

    @Override
    public Waste getWasteById(String wasteId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getWasteById'");
    }

    @Override
    public List<Waste> getAllWaste() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllWaste'");
    }

    @Override
    public void updateWaste(String wasteId, Waste waste) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateWaste'");
    }

    @Override
    public void deleteWaste(String wasteId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteWaste'");
    }

    @Override
    public void registerWaste(String wasteId, double quantity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registerWaste'");
    }

    @Override
    public void suggestReductionMeasures(String wasteId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'suggestReductionMeasures'");
    }
    
}
