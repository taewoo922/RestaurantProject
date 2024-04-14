package org.example.dao.Jeju;

import org.example.dao.Dao;
import org.example.dto.Jeju.JejuTown;

import java.util.ArrayList;
import java.util.List;

public class JejuTownDao extends Dao {
    public List<JejuTown> jejuTowns;

    public JejuTownDao() {
        jejuTowns = new ArrayList<>();
    }

    public void add(JejuTown jejuTown) {
        jejuTowns.add(jejuTown);
        lastId++;
    }

    public int getJejuTownIndexByResname(String resname) {
        int i = 0;

        for ( JejuTown jejuTown : jejuTowns ) {
            if ( jejuTown.town.equals(resname) ) {
                return i;
            }
            i++;
        }

        return -1;
    }
    public JejuTown getJejuTownByResname(String resname) {


        int index = getJejuTownIndexByResname(resname);

        if ( index == -1 ) {
            return null;
        }

        return jejuTowns.get(index);
    }
}
