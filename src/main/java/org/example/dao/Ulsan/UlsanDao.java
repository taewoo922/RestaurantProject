package org.example.dao.Ulsan;

import org.example.dao.Dao;
import org.example.dto.Seoul.Seoul;
import org.example.dto.Ulsan.Ulsan;

import java.util.ArrayList;
import java.util.List;

public class UlsanDao extends Dao {
    public List<Ulsan> ulsans;

    public UlsanDao() {
        ulsans = new ArrayList<>();
    }

    public void add(Ulsan ulsan) {
        ulsans.add(ulsan);
        lastId++;
    }

    public int getUlsanIndexByFood(String food) {
        int i = 0;

        for ( Ulsan ulsan : ulsans ) {
            if ( ulsan.food.equals(food) ) {
                return i;
            }
            i++;
        }

        return -1;
    }
    public Ulsan getUlsanByFood(String menu) {


        int index = getUlsanIndexByFood(menu);

        if ( index == -1 ) {
            return null;
        }

        return ulsans.get(index);
    }
}
