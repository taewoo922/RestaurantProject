package org.example.dao.Daejeon;

import org.example.dao.Dao;
import org.example.dto.Daejeon.DaejeonTown;
import org.example.dto.Gyeonggi.GyeonggiTown;

import java.util.ArrayList;
import java.util.List;

public class DaejeonTownDao extends Dao {
    public List<DaejeonTown> daejeonTowns;

    public DaejeonTownDao() {
        daejeonTowns = new ArrayList<>();
    }

    public void add(DaejeonTown daejeonTown) {
        daejeonTowns.add(daejeonTown);
        lastId++;
    }

    public int getDaejeonTownIndexByResname(String resname) {
        int i = 0;

        for ( DaejeonTown daejeonTown : daejeonTowns ) {
            if ( daejeonTown.town.equals(resname) ) {
                return i;
            }
            i++;
        }

        return -1;
    }
    public DaejeonTown getDaejeonTownByResname(String resname) {


        int index = getDaejeonTownIndexByResname(resname);

        if ( index == -1 ) {
            return null;
        }

        return daejeonTowns.get(index);
    }
}
