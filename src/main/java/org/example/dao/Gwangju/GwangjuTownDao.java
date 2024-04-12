package org.example.dao.Gwangju;

import org.example.dao.Dao;
import org.example.dto.Gwangju.GwangjuTown;
import org.example.dto.Seoul.SeoulTown;

import java.util.ArrayList;
import java.util.List;

public class GwangjuTownDao extends Dao {
    public List<GwangjuTown> gwangjuTowns;

    public GwangjuTownDao() {
        gwangjuTowns = new ArrayList<>();
    }

    public void add(GwangjuTown gwangjuTown) {
        gwangjuTowns.add(gwangjuTown);
        lastId++;
    }

    public int getGwangTownIndexByResname(String resname) {
        int i = 0;

        for ( GwangjuTown gwangjuTown : gwangjuTowns ) {
            if ( gwangjuTown.town.equals(resname) ) {
                return i;
            }
            i++;
        }

        return -1;
    }
    public GwangjuTown getGwangjuTownByResname(String resname) {


        int index = getGwangTownIndexByResname(resname);

        if ( index == -1 ) {
            return null;
        }

        return gwangjuTowns.get(index);
    }
}
