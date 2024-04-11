package org.example.dto;

public class Seoul extends Dto{
    public String food;
    public String foodtype;

    public Seoul (int id, String regDate, String food, String foodtype) {
        this.id = id;
        this.regDate = regDate;
        this.food = food;
        this.foodtype = foodtype;
    }
}
