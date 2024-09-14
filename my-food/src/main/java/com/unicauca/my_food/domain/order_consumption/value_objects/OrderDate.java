package com.unicauca.my_food.domain.order_consumption.value_objects;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDate {
    private String id;
    private LocalDate date;
    private LocalTime hour;
}