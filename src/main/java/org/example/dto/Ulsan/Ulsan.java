package org.example.dto.Ulsan;

import org.example.dto.Dto;

public class Ulsan extends Dto {
    public String food;
    public String foodtype;

    public Ulsan(int id, String regDate, String food, String foodtype) {
        this.id = id;
        this.regDate = regDate;
        this.food = food;
        this.foodtype = foodtype;
    }
}
