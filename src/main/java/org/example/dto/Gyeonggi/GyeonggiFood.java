package org.example.dto.Gyeonggi;

import org.example.dto.Dto;

public class GyeonggiFood extends Dto {
    public String foodtype;
    public String town;

    public GyeonggiFood(int id, String regDate, String foodtype, String town) {
        this.id = id;
        this.regDate = regDate;
        this.foodtype = foodtype;
        this.town = town;
    }
}
