package org.example.dao.Seoul;

import org.example.container.Container;
import org.example.dao.Dao;
import org.example.db.DBConnection;
import org.example.dto.Seoul.Seoul;
import org.example.dto.Seoul.SeoulFood;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SeoulFoodDao extends Dao {
//    public List<SeoulFood> seoulFoods;
    private DBConnection dbConnection;

    public SeoulFoodDao() {
//        seoulFoods = new ArrayList<>();
        dbConnection = Container.getDBConnection();
    }

//    public void add(SeoulFood seoulFood) {
//        seoulFoods.add(seoulFood);
//        lastId++;
//    }

//    public int getSeoulIndexByFood(String foodtype) {
//        int i = 0;
//
//        for ( SeoulFood seoulFood : seoulFoods ) {
//            if ( seoulFood.foodtype.equals(foodtype) ) {
//                return i;
//            }
//            i++;
//        }
//
//        return -1;
//    }
    public SeoulFood getSeoulFoodByFoodType(String town) {

        StringBuilder sb = new StringBuilder();

        sb.append(String.format("SELECT * "));
        sb.append(String.format("FROM seoulFood "));
        sb.append(String.format("WHERE foodtype = '%s'", town));

        Map<String, Object> row = dbConnection.selectRow(sb.toString());

        if (row.isEmpty()) {
            return null;
        }

        return new SeoulFood(row);
    }
}
