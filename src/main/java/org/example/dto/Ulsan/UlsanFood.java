package org.example.dto.Ulsan;

import org.example.dto.Dto;

import java.util.Map;

public class UlsanFood extends Dto {
    public String foodtype;
    public String town;

    public UlsanFood(int id, String regDate, String foodtype, String town) {
        this.id = id;
        this.regDate = regDate;
        this.foodtype = foodtype;
        this.town = town;
    }

    public UlsanFood (Map<String, Object> row) {
        super(row);
        this.town = (String) row.get("town");
        this.foodtype = (String) row.get("foodtype");
//        this.memberId = (int) row.get("memberId");
    }
}
