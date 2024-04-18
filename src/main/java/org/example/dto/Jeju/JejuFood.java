package org.example.dto.Jeju;

import org.example.dto.Dto;

import java.util.Map;

public class JejuFood extends Dto {
    public String foodtype;
    public String town;

    public JejuFood(int id, String regDate, String foodtype, String town) {
        this.id = id;
        this.regDate = regDate;
        this.foodtype = foodtype;
        this.town = town;
    }
    public JejuFood (Map<String, Object> row) {
        super(row);
        this.town = (String) row.get("town");
        this.foodtype = (String) row.get("foodtype");
//        this.memberId = (int) row.get("memberId");
    }
}
