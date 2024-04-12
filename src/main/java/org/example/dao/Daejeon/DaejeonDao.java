package org.example.dao.Daejeon;

import org.example.dao.Dao;
import org.example.dto.Daejeon.Daejeon;
import org.example.dto.Gyeonggi.Gyeonggi;

import java.util.ArrayList;
import java.util.List;

public class DaejeonDao extends Dao {
    public List<Daejeon> daejeons;

    public DaejeonDao() {
        daejeons = new ArrayList<>();
    }

    public void add(Daejeon daejeon) {
        daejeons.add(daejeon);
        lastId++;
    }

    public int getDaejeonIndexByFood(String food) {
        int i = 0;

        for ( Daejeon daejeon : daejeons ) {
            if ( daejeon.food.equals(food) ) {
                return i;
            }
            i++;
        }

        return -1;
    }
    public Daejeon getDaejeonByFood(String menu) {


        int index = getDaejeonIndexByFood(menu);

        if ( index == -1 ) {
            return null;
        }

        return daejeons.get(index);
    }
}
