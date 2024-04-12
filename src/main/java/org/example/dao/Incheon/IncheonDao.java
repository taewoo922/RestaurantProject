package org.example.dao.Incheon;

import org.example.dao.Dao;
import org.example.dto.Gyeonggi.Gyeonggi;
import org.example.dto.Incheon.Incheon;

import java.util.ArrayList;
import java.util.List;

public class IncheonDao extends Dao {
    public List<Incheon> incheons;

    public IncheonDao() {
        incheons = new ArrayList<>();
    }

    public void add(Incheon incheon) {
        incheons.add(incheon);
        lastId++;
    }

    public int getIncheonIndexByFood(String food) {
        int i = 0;

        for ( Incheon incheon : incheons ) {
            if ( incheon.food.equals(food) ) {
                return i;
            }
            i++;
        }

        return -1;
    }
    public Incheon getIncheonByFood(String menu) {


        int index = getIncheonIndexByFood(menu);

        if ( index == -1 ) {
            return null;
        }

        return incheons.get(index);
    }
}
