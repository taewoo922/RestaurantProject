package org.example.dao.Daegu;

import org.example.dao.Dao;
import org.example.dto.Daegu.Daegu;
import org.example.dto.Daejeon.Daejeon;

import java.util.ArrayList;
import java.util.List;

public class DaeguDao extends Dao {
    public List<Daegu> daegus;

    public DaeguDao() {
        daegus = new ArrayList<>();
    }

    public void add(Daegu daegu) {
        daegus.add(daegu);
        lastId++;
    }

    public int getDaeguIndexByFood(String food) {
        int i = 0;

        for ( Daegu daegu : daegus ) {
            if ( daegu.food.equals(food) ) {
                return i;
            }
            i++;
        }

        return -1;
    }
    public Daegu getDaeguByFood(String menu) {


        int index = getDaeguIndexByFood(menu);

        if ( index == -1 ) {
            return null;
        }

        return daegus.get(index);
    }
}
