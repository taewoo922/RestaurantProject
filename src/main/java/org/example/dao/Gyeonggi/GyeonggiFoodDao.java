package org.example.dao.Gyeonggi;

import org.example.dao.Dao;
import org.example.dto.Gyeonggi.GyeonggiFood;
import org.example.dto.Seoul.SeoulFood;

import java.util.ArrayList;
import java.util.List;

public class GyeonggiFoodDao extends Dao {
    public List<GyeonggiFood> gyeonggiFoods;

    public GyeonggiFoodDao() {
        gyeonggiFoods = new ArrayList<>();
    }

    public void add(GyeonggiFood gyeonggiFood) {
        gyeonggiFoods.add(gyeonggiFood);
        lastId++;
    }

    public int getGyeonggiIndexByFood(String foodtype) {
        int i = 0;

        for ( GyeonggiFood gyeonggiFood : gyeonggiFoods ) {
            if ( gyeonggiFood.foodtype.equals(foodtype) ) {
                return i;
            }
            i++;
        }

        return -1;
    }
    public GyeonggiFood getGyeonggiFoodByFoodType(String foodtype) {


        int index = getGyeonggiIndexByFood(foodtype);

        if ( index == -1 ) {
            return null;
        }

        return gyeonggiFoods.get(index);
    }
}
