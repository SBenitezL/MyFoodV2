package com.unicauca.my_food.domain.waste.service;

import java.util.HashMap;
import java.util.Map;

import com.unicauca.my_food.domain.waste.Waste;
import com.unicauca.my_food.domain.waste.constants.CauseWasteConstants;

public class WasteReductionSuggester implements IReductionSuggester {

    private static final Map<String, String> CAUSE_SUGGESTIONS = new HashMap<>();

    static{
        CAUSE_SUGGESTIONS.put(CauseWasteConstants.CAUSE_WASTE_EXPIRED, "Medida sugerida: Mejora la rotación de inventario y revisa fechas de vencimiento.");
        CAUSE_SUGGESTIONS.put(CauseWasteConstants.CAUSE_WASTE_BAD_STORAGE, "Medida sugerida: Revisa las condiciones de almacenamiento.");
        CAUSE_SUGGESTIONS.put(CauseWasteConstants.CAUSE_WASTE_EXCESS_PREPARATION, "Medida sugerida: Ajusta las cantidades en la preparación de alimentos.");
        CAUSE_SUGGESTIONS.put(CauseWasteConstants.CAUSE_WASTE_PREPARATION_ERROR, "Medida sugerida: Revisa los procedimientos de preparación para evitar errores.");
        CAUSE_SUGGESTIONS.put(CauseWasteConstants.CAUSE_WASTE_CUSTOMER_RETURN, "Medida sugerida: Analiza las razones de las devoluciones de clientes y ajusta los procesos.");
        CAUSE_SUGGESTIONS.put(CauseWasteConstants.CAUSE_WASTE_TRANSPORTER_DAMAGE, "Medida sugerida: Mejora las prácticas de transporte para evitar daños.");
        CAUSE_SUGGESTIONS.put(CauseWasteConstants.CAUSE_WASTE_WEATHER_CONDITIONS, "Medida sugerida: Ajusta el almacenamiento para adaptarse a las condiciones climáticas.");
        CAUSE_SUGGESTIONS.put(CauseWasteConstants.CAUSE_WASTE_HANDLING_DAMAGE, "Medida sugerida: Capacita al personal para manejar los productos con cuidado.");
        CAUSE_SUGGESTIONS.put(CauseWasteConstants.CAUSE_WASTE_DEFECTIVE_INGREDIENTS, "Medida sugerida: Revisa y controla la calidad de los ingredientes.");
        CAUSE_SUGGESTIONS.put(CauseWasteConstants.CAUSE_WASTE_EXCESS_PORTIONS, "Medida sugerida: Ajusta las porciones para evitar el exceso.");
        CAUSE_SUGGESTIONS.put(CauseWasteConstants.CAUSE_WASTE_CANCELED_ORDER, "Medida sugerida: Revisa los procedimientos de gestión de pedidos para evitar cancelaciones.");
        CAUSE_SUGGESTIONS.put(CauseWasteConstants.CAUSE_WASTE_CROSS_CONTAMINATION, "Medida sugerida: Implementa medidas de seguridad alimentaria para evitar la contaminación cruzada.");
        CAUSE_SUGGESTIONS.put(CauseWasteConstants.CAUSE_WASTE_ERROR, "Medida sugerida: Revisa y corrige los errores en los procesos de manejo de alimentos.");
    }
    
    @Override
    public String suggest(Waste waste) {
        StringBuilder suggestions = new StringBuilder();
        appendWasteQuantitySuggestions(waste, suggestions);
        appendCauseSuggestions(waste, suggestions);
        return suggestions.toString();
    }

    private void appendWasteQuantitySuggestions(Waste waste, StringBuilder suggestions){
        double totalWaste = waste.getQuantityWaste().getTotalWasteQuantity();
        String suggestion = getSuggestionForRange(totalWaste);
        suggestions.append(suggestion).append("\n");
    }

    private String getSuggestionForRange(double totalWaste){
        if (totalWaste > 75) 
            return "Reducción sugerida: La cantidad de desperdicio es extremadamente alta. Reevalúa la planificación.";
        else if (totalWaste > 50)
            return "Reducción sugerida: Revisa los procedimientos para evitar sobrepreparación o mal almacenamiento.";
        else if (totalWaste > 25) 
            return "Reducción sugerida: Podría ser necesario ajustar la gestión del inventario y las porciones.";
        else 
            return "Reducción sugerida: El nivel de desperdicio es bajo, sigue con las buenas prácticas.";
    }

    private void appendCauseSuggestions(Waste waste, StringBuilder suggestions){
        String causeDescription = waste.getCause().getDescription();
        String suggestion = CAUSE_SUGGESTIONS.getOrDefault(causeDescription, "Sugerencia: Analiza más a fondo las causas para proponer acciones correctivas.");
        suggestions.append(suggestion).append("\n");
    }
    
}
