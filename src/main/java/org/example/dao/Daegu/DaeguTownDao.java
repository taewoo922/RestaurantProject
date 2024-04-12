package org.example.dao.Daegu;

import org.example.dao.Dao;
import org.example.dto.Daegu.DaeguTown;
import org.example.dto.Daejeon.DaejeonTown;

import java.util.ArrayList;
import java.util.List;

public class DaeguTownDao extends Dao {
    public List<DaeguTown> daeguTowns;

    public DaeguTownDao() {
        daeguTowns = new ArrayList<>();
    }

    public void add(DaeguTown daeguTown) {
        daeguTowns.add(daeguTown);
        lastId++;
    }

    public int getDaeguTownIndexByResname(String resname) {
        int i = 0;

        for ( DaeguTown daeguTown : daeguTowns ) {
            if ( daeguTown.town.equals(resname) ) {
                return i;
            }
            i++;
        }

        return -1;
    }
    public DaeguTown getDaeguTownByResname(String resname) {


        int index = getDaeguTownIndexByResname(resname);

        if ( index == -1 ) {
            return null;
        }

        return daeguTowns.get(index);
    }
}
