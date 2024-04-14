package org.example.dao.Busan;

import org.example.dao.Dao;
import org.example.dto.Busan.Busan;

import java.util.ArrayList;
import java.util.List;

public class BusanDao extends Dao {
    public List<Busan> busans;

    public BusanDao() {
        busans = new ArrayList<>();
    }

    public void add(Busan busan) {
        busans.add(busan);
        lastId++;
    }

    public int getBusanIndexByFood(String food) {
        int i = 0;

        for ( Busan busan : busans ) {
            if ( busan.food.equals(food) ) {
                return i;
            }
            i++;
        }

        return -1;
    }
    public Busan getBusanByFood(String menu) {


        int index = getBusanIndexByFood(menu);

        if ( index == -1 ) {
            return null;
        }

        return busans.get(index);
    }
}
