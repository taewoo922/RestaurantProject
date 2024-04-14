package org.example.dao.Jeju;

import org.example.dao.Dao;
import org.example.dto.Jeju.JejuFood;

import java.util.ArrayList;
import java.util.List;

public class JejuFoodDao extends Dao {
    public List<JejuFood>  jejuFoods;

    public JejuFoodDao() {
        jejuFoods = new ArrayList<>();
    }

    public void add(JejuFood jejuFood) {
        jejuFoods.add(jejuFood);
        lastId++;
    }

    public int getJejuIndexByFood(String foodtype) {
        int i = 0;

        for ( JejuFood jejuFood : jejuFoods ) {
            if ( jejuFood.foodtype.equals(foodtype) ) {
                return i;
            }
            i++;
        }

        return -1;
    }
    public JejuFood getJejuFoodByFoodType(String foodtype) {


        int index = getJejuIndexByFood(foodtype);

        if ( index == -1 ) {
            return null;
        }

        return jejuFoods.get(index);
    }
}
