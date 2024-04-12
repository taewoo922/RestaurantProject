package org.example.dto.Daejeon;

import org.example.dto.Dto;

public class DaejeonFood extends Dto {
    public String foodtype;
    public String town;

    public DaejeonFood(int id, String regDate, String foodtype, String town) {
        this.id = id;
        this.regDate = regDate;
        this.foodtype = foodtype;
        this.town = town;
    }
}
