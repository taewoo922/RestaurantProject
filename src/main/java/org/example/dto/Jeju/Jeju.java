package org.example.dto.Jeju;

import org.example.dto.Dto;

public class Jeju extends Dto {
    public String food;
    public String foodtype;

    public Jeju(int id, String regDate, String food, String foodtype) {
        this.id = id;
        this.regDate = regDate;
        this.food = food;
        this.foodtype = foodtype;
    }
}
