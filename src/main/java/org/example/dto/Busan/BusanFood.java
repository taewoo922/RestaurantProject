package org.example.dto.Busan;

import org.example.dto.Dto;

public class BusanFood extends Dto {
    public String foodtype;
    public String town;

    public BusanFood(int id, String regDate, String foodtype, String town) {
        this.id = id;
        this.regDate = regDate;
        this.foodtype = foodtype;
        this.town = town;
    }
}
