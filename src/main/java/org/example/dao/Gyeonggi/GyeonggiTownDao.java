package org.example.dao.Gyeonggi;

import org.example.dao.Dao;
import org.example.dto.Gyeonggi.GyeonggiTown;
import org.example.dto.Seoul.SeoulTown;

import java.util.ArrayList;
import java.util.List;

public class GyeonggiTownDao extends Dao {
    public List<GyeonggiTown> gyeonggiTowns;

    public GyeonggiTownDao() {
        gyeonggiTowns = new ArrayList<>();
    }

    public void add(GyeonggiTown gyeonggiTown) {
        gyeonggiTowns.add(gyeonggiTown);
        lastId++;
    }

    public int getSeoulTownIndexByResname(String resname) {
        int i = 0;

        for ( GyeonggiTown gyeonggiTown : gyeonggiTowns ) {
            if ( gyeonggiTown.town.equals(resname) ) {
                return i;
            }
            i++;
        }

        return -1;
    }
    public GyeonggiTown getGyeonggiTownByResname(String resname) {


        int index = getSeoulTownIndexByResname(resname);

        if ( index == -1 ) {
            return null;
        }

        return gyeonggiTowns.get(index);
    }
}
