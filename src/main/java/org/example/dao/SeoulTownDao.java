package org.example.dao;

import org.example.dto.SeoulFood;
import org.example.dto.SeoulTown;

import java.util.ArrayList;
import java.util.List;

public class SeoulTownDao extends Dao {
    public List<SeoulTown> seoulTowns;

    public SeoulTownDao() {
        seoulTowns = new ArrayList<>();
    }

    public void add(SeoulTown seoulTown) {
        seoulTowns.add(seoulTown);
        lastId++;
    }

    public int getSeoulTownIndexByResname(String resname) {
        int i = 0;

        for ( SeoulTown seoulTown : seoulTowns ) {
            if ( seoulTown.town.equals(resname) ) {
                return i;
            }
            i++;
        }

        return -1;
    }
    public SeoulTown getSeoulTownByResname(String resname) {


        int index = getSeoulTownIndexByResname(resname);

        if ( index == -1 ) {
            return null;
        }

        return seoulTowns.get(index);
    }
}
