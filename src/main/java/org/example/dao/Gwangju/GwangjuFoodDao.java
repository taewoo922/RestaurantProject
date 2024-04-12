package org.example.dao.Gwangju;

import org.example.dao.Dao;
import org.example.dto.Gwangju.GwangjuFood;
import org.example.dto.Seoul.SeoulFood;

import java.util.ArrayList;
import java.util.List;

public class GwangjuFoodDao extends Dao {
    public List<GwangjuFood> gwangjuFoods;

    public GwangjuFoodDao() {
        gwangjuFoods = new ArrayList<>();
    }

    public void add(GwangjuFood gwangjuFood) {
        gwangjuFoods.add(gwangjuFood);
        lastId++;
    }

    public int getGwangjuIndexByFood(String foodtype) {
        int i = 0;

        for ( GwangjuFood gwangjuFood : gwangjuFoods ) {
            if ( gwangjuFood.foodtype.equals(foodtype) ) {
                return i;
            }
            i++;
        }

        return -1;
    }
    public GwangjuFood getGwangjuFoodByFoodType(String foodtype) {


        int index = getGwangjuIndexByFood(foodtype);

        if ( index == -1 ) {
            return null;
        }

        return gwangjuFoods.get(index);
    }
}
