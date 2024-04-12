package org.example.dto.Daejeon;

import org.example.dto.Dto;

public class Daejeon extends Dto {
    public String food;
    public String foodtype;

    public Daejeon(int id, String regDate, String food, String foodtype) {
        this.id = id;
        this.regDate = regDate;
        this.food = food;
        this.foodtype = foodtype;
    }
}
