package org.example.dao.Busan;

import org.example.container.Container;
import org.example.dao.Dao;
import org.example.db.DBConnection;
import org.example.dto.Busan.BusanFood;
import org.example.dto.Daegu.DaeguFood;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BusanFoodDao extends Dao {
    private DBConnection dbConnection;

    public BusanFoodDao() {
        dbConnection = Container.getDBConnection();
    }
    public BusanFood getBusanFoodByFoodType(String town) {

        StringBuilder sb = new StringBuilder();

        sb.append(String.format("SELECT * "));
        sb.append(String.format("FROM busanFood "));
        sb.append(String.format("WHERE foodtype LIKE CONCAT('%%','%s','%%')", town));
//        sb.append(String.format("WHERE foodtype = '%s'", town));

        Map<String, Object> row = dbConnection.selectRow(sb.toString());

        if (row.isEmpty()) {
            return null;
        }

        return new BusanFood(row);
    }
}
