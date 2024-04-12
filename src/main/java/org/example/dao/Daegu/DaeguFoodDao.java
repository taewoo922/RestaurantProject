package org.example.dao.Daegu;

import org.example.dao.Dao;
import org.example.dto.Daegu.DaeguFood;
import org.example.dto.Daejeon.DaejeonFood;

import java.util.ArrayList;
import java.util.List;

public class DaeguFoodDao extends Dao {
    public List<DaeguFood> daeguFoods;

    public DaeguFoodDao() {
        daeguFoods = new ArrayList<>();
    }

    public void add(DaeguFood daeguFood) {
        daeguFoods.add(daeguFood);
        lastId++;
    }

    public int getDaeguIndexByFood(String foodtype) {
        int i = 0;

        for ( DaeguFood daeguFood : daeguFoods ) {
            if ( daeguFood.foodtype.equals(foodtype) ) {
                return i;
            }
            i++;
        }

        return -1;
    }
    public DaeguFood getDaeguFoodByFoodType(String foodtype) {


        int index = getDaeguIndexByFood(foodtype);

        if ( index == -1 ) {
            return null;
        }

        return daeguFoods.get(index);
    }
}
