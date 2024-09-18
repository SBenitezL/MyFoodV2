package com.unicauca.my_food.domain.waste.value_objects;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

import com.unicauca.my_food.domain.waste.constants.CauseWasteConstants;

import lombok.Getter;

@Getter
public class CauseWaste {
    private String id;
    private String description;
    private List<String> causes;

    public CauseWaste(int causeIndex){
        this.id = UUID.randomUUID().toString();
        this.description = selectCause(causeIndex);
        this.causes = Collections.unmodifiableList(CauseWasteConstants.getAllCauses());
    }

    public String selectCause(int causeIndex){
        if(causeIndex > 0 && causeIndex <= causes.size()){
            return causes.get(causeIndex - 1);
        }else{
            return CauseWasteConstants.CAUSE_WASTE_ERROR;
        }
    }

    public boolean isValidCause(String cause){
        return causes.contains(cause);
    }
}
