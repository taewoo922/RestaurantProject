package org.example.dto.Seoul;

import org.example.dto.Dto;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class Seoul extends Dto {
    public String food;
    public String foodtype;
    public int memberId;

    public Seoul (int id, String regDate, String food, String foodtype) {
        this.id = id;
//        this.memberId = memberId;
        this.regDate = regDate;
        this.food = food;
        this.foodtype = foodtype;

    }

    public Seoul (Map<String, Object> row) {
        super(row);
        this.food = (String) row.get("food");
        this.foodtype = (String) row.get("foodtype");
//        this.memberId = (int) row.get("memberId");
    }
}
