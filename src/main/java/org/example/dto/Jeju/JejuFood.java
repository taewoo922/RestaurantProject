package org.example.dto.Jeju;

import org.example.dto.Dto;

public class JejuFood extends Dto {
    public String foodtype;
    public String town;

    public JejuFood(int id, String regDate, String foodtype, String town) {
        this.id = id;
        this.regDate = regDate;
        this.foodtype = foodtype;
        this.town = town;
    }
}
