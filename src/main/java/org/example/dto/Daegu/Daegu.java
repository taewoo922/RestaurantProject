package org.example.dto.Daegu;

import org.example.dto.Dto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Daegu extends Dto {
    public String food;
    public String foodtype;

    public Daegu(int id, String regDate, String food, String foodtype) {
        this.id = id;
        this.regDate = regDate;
        this.food = food;
        this.foodtype = foodtype;
    }
}
