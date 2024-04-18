package org.example.dto.Busan;

import org.example.dto.Dto;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class Busan extends Dto {
    public String food;
    public String foodtype;

    public Busan(int id, String regDate, String food, String foodtype) {
        this.id = id;
        this.regDate = regDate;
        this.food = food;
        this.foodtype = foodtype;
    }
    public Busan (Map<String, Object> row) {
        super(row);
        this.food = (String) row.get("food");
        this.foodtype = (String) row.get("foodtype");
//        this.memberId = (int) row.get("memberId");
    }
}
