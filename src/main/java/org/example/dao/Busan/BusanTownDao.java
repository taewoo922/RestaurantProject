package org.example.dao.Busan;

import org.example.dao.Dao;
import org.example.dto.Busan.BusanTown;

import java.util.ArrayList;
import java.util.List;

public class BusanTownDao extends Dao {
    public List<BusanTown> busanTowns;

    public BusanTownDao() {
        busanTowns = new ArrayList<>();
    }

    public void add(BusanTown busanTown) {
        busanTowns.add(busanTown);
        lastId++;
    }

    public int getBusanTownIndexByResname(String resname) {
        int i = 0;

        for ( BusanTown busanTown : busanTowns ) {
            if ( busanTown.town.equals(resname) ) {
                return i;
            }
            i++;
        }

        return -1;
    }
    public BusanTown getBusanTownByResname(String resname) {


        int index = getBusanTownIndexByResname(resname);

        if ( index == -1 ) {
            return null;
        }

        return busanTowns.get(index);
    }
}
