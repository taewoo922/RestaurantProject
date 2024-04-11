package org.example.dto;

public class SeoulFood extends Dto{
    public String foodtype;
    public String town;

    public SeoulFood(int id, String regDate, String foodtype, String town) {
        this.id = id;
        this.regDate = regDate;
        this.foodtype = foodtype;
        this.town = town;
    }
}
