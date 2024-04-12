package org.example.dto.Gwangju;

import org.example.dto.Dto;

public class GwangjuFood extends Dto {
    public String foodtype;
    public String town;

    public GwangjuFood(int id, String regDate, String foodtype, String town) {
        this.id = id;
        this.regDate = regDate;
        this.foodtype = foodtype;
        this.town = town;
    }
}
