package org.example.dao.Gyeonggi;

import org.example.dao.Dao;
import org.example.dto.Gyeonggi.Gyeonggi;
import org.example.dto.Seoul.Seoul;

import java.util.ArrayList;
import java.util.List;

public class GyeonggiDao extends Dao {
    public List<Gyeonggi> gyeonggis;

    public GyeonggiDao() {
        gyeonggis = new ArrayList<>();
    }

    public void add(Gyeonggi gyeonggi) {
        gyeonggis.add(gyeonggi);
        lastId++;
    }

    public int getGyeonggiIndexByFood(String food) {
        int i = 0;

        for ( Gyeonggi gyeonggi : gyeonggis ) {
            if ( gyeonggi.food.equals(food) ) {
                return i;
            }
            i++;
        }

        return -1;
    }
    public Gyeonggi getGyeonggiByFood(String menu) {


        int index = getGyeonggiIndexByFood(menu);

        if ( index == -1 ) {
            return null;
        }

        return gyeonggis.get(index);
    }
}
