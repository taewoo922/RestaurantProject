package org.example.dao.Ulsan;

import org.example.dao.Dao;
import org.example.dto.Seoul.SeoulTown;
import org.example.dto.Ulsan.UlsanTown;

import java.util.ArrayList;
import java.util.List;

public class UlsanTownDao extends Dao {
    public List<UlsanTown> ulsanTowns;

    public UlsanTownDao() {
        ulsanTowns = new ArrayList<>();
    }

    public void add(UlsanTown ulsanTown) {
        ulsanTowns.add(ulsanTown);
        lastId++;
    }

    public int getUlsanTownIndexByResname(String resname) {
        int i = 0;

        for ( UlsanTown ulsanTown : ulsanTowns ) {
            if ( ulsanTown.town.equals(resname) ) {
                return i;
            }
            i++;
        }

        return -1;
    }
    public UlsanTown getUlsanTownByResname(String resname) {


        int index = getUlsanTownIndexByResname(resname);

        if ( index == -1 ) {
            return null;
        }

        return ulsanTowns.get(index);
    }
}
