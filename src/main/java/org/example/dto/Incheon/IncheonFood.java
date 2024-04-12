package org.example.dto.Incheon;

import org.example.dto.Dto;

public class IncheonFood extends Dto {
    public String foodtype;
    public String town;

    public IncheonFood(int id, String regDate, String foodtype, String town) {
        this.id = id;
        this.regDate = regDate;
        this.foodtype = foodtype;
        this.town = town;
    }
}
