package org.example.dao;

import org.example.dto.Seoul;
import org.example.dto.SeoulFood;

import java.util.ArrayList;
import java.util.List;

public class SeoulDao {
    public List<Seoul> seouls;

    public SeoulDao() {
        seouls = new ArrayList<>();
    }
    public String getSeoulByFood(String menu) {

        int i = 0;

        for ( Seoul seoul : seouls ) {
            if (seoul.food.equals(menu)) {
                return menu;
            }
            i++;
        }
        return null;
    }
}
