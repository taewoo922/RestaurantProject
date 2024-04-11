package org.example.dto.Seoul;

import org.example.dto.Dto;

public class Seoul extends Dto {
    public String food;
    public String foodtype;

    public Seoul (int id, String regDate, String food, String foodtype) {
        this.id = id;
        this.regDate = regDate;
        this.food = food;
        this.foodtype = foodtype;
    }
}
