package org.example.dao.Busan;

import org.example.dao.Dao;
import org.example.dto.Busan.BusanFood;

import java.util.ArrayList;
import java.util.List;

public class BusanFoodDao extends Dao {
    public List<BusanFood> busanFoods;

    public BusanFoodDao() {
        busanFoods = new ArrayList<>();
    }

    public void add(BusanFood busanFood) {
        busanFoods.add(busanFood);
        lastId++;
    }

    public int getBusanIndexByFood(String foodtype) {
        int i = 0;

        for ( BusanFood busanFood : busanFoods ) {
            if ( busanFood.foodtype.equals(foodtype) ) {
                return i;
            }
            i++;
        }

        return -1;
    }
    public BusanFood getBusanFoodByFoodType(String foodtype) {


        int index = getBusanIndexByFood(foodtype);

        if ( index == -1 ) {
            return null;
        }

        return busanFoods.get(index);
    }
}
