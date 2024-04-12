package org.example.dto.Incheon;

import org.example.dto.Dto;

public class Incheon extends Dto {
    public String food;
    public String foodtype;

    public Incheon(int id, String regDate, String food, String foodtype) {
        this.id = id;
        this.regDate = regDate;
        this.food = food;
        this.foodtype = foodtype;
    }
}
