package com.unicauca.my_food.domain.waste.service;

import java.util.List;

import com.unicauca.my_food.domain.waste.Waste;
import com.unicauca.my_food.domain.waste.value_objects.WasteReport;

public interface IWasteReportGenerator {
    WasteReport generateMonthlyReport(List<Waste> wasteList);
}
