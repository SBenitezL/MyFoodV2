package com.unicauca.my_food.domain.waste.constants;

import java.util.ArrayList;
import java.util.List;

public class CauseWasteConstants {
    public static final String CAUSE_WASTE_EXPIRED = "Expired";
    public static final String CAUSE_WASTE_EXCESS_PREPARATION = "Excess preparation";
    public static final String CAUSE_WASTE_BAD_STORAGE = "Bad storage";
    public static final String CAUSE_WASTE_PREPARATION_ERROR = "Preparation error";
    public static final String CAUSE_WASTE_CUSTOMER_RETURN = "Custom return";
    public static final String CAUSE_WASTE_TRANSPORTER_DAMAGE = "Transporter damage";
    public static final String CAUSE_WASTE_WEATHER_CONDITIONS = "Weather conditions";
    public static final String CAUSE_WASTE_HANDLING_DAMAGE = "Handling damage";
    public static final String CAUSE_WASTE_DEFECTIVE_INGREDIENTS = "Defective ingredients";
    public static final String CAUSE_WASTE_EXCESS_PORTIONS = "Excess portions";
    public static final String CAUSE_WASTE_CANCELED_ORDER = "Canceled order";
    public static final String CAUSE_WASTE_CROSS_CONTAMINATION = "Cross contamination";
    public static final String CAUSE_WASTE_ERROR = "Error";

    public static List<String> getAllCauses(){
        List<String> causes = new ArrayList<>();
        causes.add(CAUSE_WASTE_EXPIRED);
        causes.add(CAUSE_WASTE_EXCESS_PREPARATION);
        causes.add(CAUSE_WASTE_BAD_STORAGE);
        causes.add(CAUSE_WASTE_PREPARATION_ERROR);
        causes.add(CAUSE_WASTE_CUSTOMER_RETURN);
        causes.add(CAUSE_WASTE_TRANSPORTER_DAMAGE);
        causes.add(CAUSE_WASTE_WEATHER_CONDITIONS);
        causes.add(CAUSE_WASTE_HANDLING_DAMAGE);
        causes.add(CAUSE_WASTE_DEFECTIVE_INGREDIENTS);
        causes.add(CAUSE_WASTE_EXCESS_PORTIONS);
        causes.add(CAUSE_WASTE_CANCELED_ORDER);
        causes.add(CAUSE_WASTE_CROSS_CONTAMINATION);
        causes.add(CAUSE_WASTE_ERROR);
        return causes;
    }
}