package org.example.dto.Daejeon;

import org.example.dto.Dto;

import java.util.Map;

public class DaejeonFood extends Dto {
    public String foodtype;
    public String town;

    public DaejeonFood(int id, String regDate, String foodtype, String town) {
        this.id = id;
        this.regDate = regDate;
        this.foodtype = foodtype;
        this.town = town;
    }

    public DaejeonFood (Map<String, Object> row) {
        super(row);
        this.town = (String) row.get("town");
        this.foodtype = (String) row.get("foodtype");
//        this.memberId = (int) row.get("memberId");
    }
}
