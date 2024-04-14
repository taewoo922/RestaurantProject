package org.example.dao.Ulsan;

import org.example.dao.Dao;
import org.example.dto.Seoul.SeoulFood;
import org.example.dto.Ulsan.UlsanFood;

import java.util.ArrayList;
import java.util.List;

public class UlsanFoodDao extends Dao {
    public List<UlsanFood> ulsanFoods;

    public UlsanFoodDao() {
        ulsanFoods = new ArrayList<>();
    }

    public void add(UlsanFood ulsanFood) {
        ulsanFoods.add(ulsanFood);
        lastId++;
    }

    public int getUlsanIndexByFood(String foodtype) {
        int i = 0;

        for ( UlsanFood ulsanFood : ulsanFoods ) {
            if ( ulsanFood.foodtype.equals(foodtype) ) {
                return i;
            }
            i++;
        }

        return -1;
    }
    public UlsanFood getUlsanFoodByFoodType(String foodtype) {


        int index = getUlsanIndexByFood(foodtype);

        if ( index == -1 ) {
            return null;
        }

        return ulsanFoods.get(index);
    }
}
