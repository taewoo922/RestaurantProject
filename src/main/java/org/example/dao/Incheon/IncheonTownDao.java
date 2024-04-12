package org.example.dao.Incheon;

import org.example.dao.Dao;
import org.example.dto.Gyeonggi.GyeonggiTown;
import org.example.dto.Incheon.IncheonTown;

import java.util.ArrayList;
import java.util.List;

public class IncheonTownDao extends Dao {
    public List<IncheonTown> incheonTowns;

    public IncheonTownDao() {
        incheonTowns = new ArrayList<>();
    }

    public void add(IncheonTown incheonTown) {
        incheonTowns.add(incheonTown);
        lastId++;
    }

    public int getIncheonTownIndexByResname(String resname) {
        int i = 0;

        for ( IncheonTown incheonTown : incheonTowns ) {
            if ( incheonTown.town.equals(resname) ) {
                return i;
            }
            i++;
        }

        return -1;
    }
    public IncheonTown getIncheonTownByResname(String resname) {


        int index = getIncheonTownIndexByResname(resname);

        if ( index == -1 ) {
            return null;
        }

        return incheonTowns.get(index);
    }
}
