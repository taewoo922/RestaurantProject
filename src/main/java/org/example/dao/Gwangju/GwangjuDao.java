package org.example.dao.Gwangju;

import org.example.dao.Dao;
import org.example.dto.Gwangju.Gwangju;
import org.example.dto.Seoul.Seoul;

import java.util.ArrayList;
import java.util.List;

public class GwangjuDao extends Dao {
    public List<Gwangju> gwangjus;

    public GwangjuDao() {
        gwangjus = new ArrayList<>();
    }

    public void add(Gwangju gwangju) {
        gwangjus.add(gwangju);
        lastId++;
    }

    public int getGwangjuIndexByFood(String food) {
        int i = 0;

        for ( Gwangju gwangju : gwangjus ) {
            if ( gwangju.food.equals(food) ) {
                return i;
            }
            i++;
        }

        return -1;
    }
    public Gwangju getGwangjuByFood(String menu) {


        int index = getGwangjuIndexByFood(menu);

        if ( index == -1 ) {
            return null;
        }

        return gwangjus.get(index);
    }
}
