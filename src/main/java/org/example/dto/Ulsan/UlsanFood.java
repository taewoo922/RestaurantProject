package org.example.dto.Ulsan;

import org.example.dto.Dto;

public class UlsanFood extends Dto {
    public String foodtype;
    public String town;

    public UlsanFood(int id, String regDate, String foodtype, String town) {
        this.id = id;
        this.regDate = regDate;
        this.foodtype = foodtype;
        this.town = town;
    }
}
