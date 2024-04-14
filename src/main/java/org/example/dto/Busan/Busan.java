package org.example.dto.Busan;

import org.example.dto.Dto;

public class Busan extends Dto {
    public String food;
    public String foodtype;

    public Busan(int id, String regDate, String food, String foodtype) {
        this.id = id;
        this.regDate = regDate;
        this.food = food;
        this.foodtype = foodtype;
    }
}
