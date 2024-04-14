package org.example.dao.Jeju;

import org.example.dao.Dao;
import org.example.dto.Jeju.Jeju;

import java.util.ArrayList;
import java.util.List;

public class JejuDao extends Dao {
    public List<Jeju> jejus;

    public JejuDao() {
        jejus = new ArrayList<>();
    }

    public void add(Jeju jeju) {
        jejus.add(jeju);
        lastId++;
    }

    public int getJejuIndexByFood(String food) {
        int i = 0;

        for ( Jeju jeju : jejus ) {
            if ( jeju.food.equals(food) ) {
                return i;
            }
            i++;
        }

        return -1;
    }
    public Jeju getJejuByFood(String menu) {


        int index = getJejuIndexByFood(menu);

        if ( index == -1 ) {
            return null;
        }

        return jejus.get(index);
    }
}
