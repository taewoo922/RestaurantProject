package org.example.dao.Incheon;

import org.example.dao.Dao;
import org.example.dto.Gyeonggi.GyeonggiFood;
import org.example.dto.Incheon.IncheonFood;

import java.util.ArrayList;
import java.util.List;

public class IncheonFoodDao extends Dao {
    public List<IncheonFood> incheonFoods;

    public IncheonFoodDao() {
        incheonFoods = new ArrayList<>();
    }

    public void add(IncheonFood incheonFood) {
        incheonFoods.add(incheonFood);
        lastId++;
    }

    public int getIncheonIndexByFood(String foodtype) {
        int i = 0;

        for ( IncheonFood incheonFood : incheonFoods ) {
            if ( incheonFood.foodtype.equals(foodtype) ) {
                return i;
            }
            i++;
        }

        return -1;
    }
    public IncheonFood getIncheonFoodByFoodType(String foodtype) {


        int index = getIncheonIndexByFood(foodtype);

        if ( index == -1 ) {
            return null;
        }

        return incheonFoods.get(index);
    }
}
