package org.example.dto.Daegu;

import org.example.dto.Dto;

public class DaeguFood extends Dto {
    public String foodtype;
    public String town;

    public DaeguFood(int id, String regDate, String foodtype, String town) {
        this.id = id;
        this.regDate = regDate;
        this.foodtype = foodtype;
        this.town = town;
    }
}
