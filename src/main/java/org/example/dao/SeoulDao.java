package org.example.dao;

import org.example.dto.Member;
import org.example.dto.Seoul;
import org.example.dto.SeoulFood;

import java.util.ArrayList;
import java.util.List;

public class SeoulDao extends Dao {
    public List<Seoul> seouls;

    public SeoulDao() {
        seouls = new ArrayList<>();
    }

    public void add(Seoul seoul) {
        seouls.add(seoul);
        lastId++;
    }

    public int getSeoulIndexByFood(String food) {
        int i = 0;

        for ( Seoul seoul : seouls ) {
            if ( seoul.food.equals(food) ) {
                return i;
            }
            i++;
        }

        return -1;
    }
    public Seoul getSeoulByFood(String menu) {


        int index = getSeoulIndexByFood(menu);

        if ( index == -1 ) {
            return null;
        }

        return seouls.get(index);
    }
}
