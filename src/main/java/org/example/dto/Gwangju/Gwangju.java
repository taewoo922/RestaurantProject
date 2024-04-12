package org.example.dto.Gwangju;

import org.example.dto.Dto;

public class Gwangju extends Dto {
    public String food;
    public String foodtype;

    public Gwangju(int id, String regDate, String food, String foodtype) {
        this.id = id;
        this.regDate = regDate;
        this.food = food;
        this.foodtype = foodtype;
    }
}
