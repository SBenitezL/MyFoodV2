package com.unicauca.my_food.domain.menu.value_objects;

import java.time.LocalDate;
import lombok.Getter;
import com.unicauca.my_food.infrastucture.exceptionHandler.ownException.ObjectNullException;
import java.time.format.DateTimeFormatter;


@Getter

public class DateMenu {
    private String date;

    public DateMenu() {
        createOrderDate();
    }
    private void createOrderDate(){
        if (this.date == null) {
            throw new ObjectNullException("Date is null...");
        }
        LocalDate myDate = LocalDate.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.date = myDate.format(dateFormatter);
    }   


}