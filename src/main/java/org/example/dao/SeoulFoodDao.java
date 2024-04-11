package org.example.dao;

import org.example.dto.Seoul;
import org.example.dto.SeoulFood;

import java.util.ArrayList;
import java.util.List;

public class SeoulFoodDao extends Dao {
    public List<SeoulFood> seoulFoods;

    public SeoulFoodDao() {
        seoulFoods = new ArrayList<>();
    }

    public void add(SeoulFood seoulFood) {
        seoulFoods.add(seoulFood);
        lastId++;
    }

    public int getSeoulIndexByFood(String foodtype) {
        int i = 0;

        for ( SeoulFood seoulFood : seoulFoods ) {
            if ( seoulFood.foodtype.equals(foodtype) ) {
                return i;
            }
            i++;
        }

        return -1;
    }
    public SeoulFood getSeoulFoodByFoodType(String foodtype) {


        int index = getSeoulIndexByFood(foodtype);

        if ( index == -1 ) {
            return null;
        }

        return seoulFoods.get(index);
    }
}
