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

    private DBConnection dbConnection;

    public SeoulFoodDao() {
        dbConnection = Container.getDBConnection();
    }

    public SeoulFood getSeoulFoodByFoodType(String foodtype) {

        StringBuilder sb = new StringBuilder();

        sb.append(String.format("SELECT * "));
        sb.append(String.format("FROM seoulFood "));
        sb.append(String.format("WHERE foodtype LIKE CONCAT('%%','%s','%%')", foodtype));
//        sb.append(String.format("WHERE foodtype = '%s'", town));

        Map<String, Object> row = dbConnection.selectRow(sb.toString());

        if (row.isEmpty()) {
            return null;
        }

        return new SeoulFood(row);
    }
}
