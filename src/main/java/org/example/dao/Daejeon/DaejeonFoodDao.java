package org.example.dao.Daejeon;

import org.example.dao.Dao;
import org.example.dto.Daejeon.DaejeonFood;
import org.example.dto.Gyeonggi.GyeonggiFood;

import java.util.ArrayList;
import java.util.List;

public class DaejeonFoodDao extends Dao {
    public List<DaejeonFood> daejeonFoods;

    public DaejeonFoodDao() {
        daejeonFoods = new ArrayList<>();
    }

    public void add(DaejeonFood daejeonFood) {
        daejeonFoods.add(daejeonFood);
        lastId++;
    }

    public int getDaejeonIndexByFood(String foodtype) {
        int i = 0;

        for ( DaejeonFood daejeonFood : daejeonFoods ) {
            if ( daejeonFood.foodtype.equals(foodtype) ) {
                return i;
            }
            i++;
        }

        return -1;
    }
    public DaejeonFood getDaejeonFoodByFoodType(String foodtype) {


        int index = getDaejeonIndexByFood(foodtype);

        if ( index == -1 ) {
            return null;
        }

        return daejeonFoods.get(index);
    }
}
