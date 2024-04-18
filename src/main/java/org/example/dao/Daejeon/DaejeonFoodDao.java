package org.example.dao.Daejeon;

import org.example.container.Container;
import org.example.dao.Dao;
import org.example.db.DBConnection;
import org.example.dto.Daejeon.DaejeonFood;
import org.example.dto.Gyeonggi.GyeonggiFood;
import org.example.dto.Seoul.SeoulFood;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DaejeonFoodDao extends Dao {
    private DBConnection dbConnection;

    public DaejeonFoodDao() {
        dbConnection = Container.getDBConnection();
    }

    public DaejeonFood getDaejeonFoodByFoodType(String town) {

        StringBuilder sb = new StringBuilder();

        sb.append(String.format("SELECT * "));
        sb.append(String.format("FROM daejeonFood "));
        sb.append(String.format("WHERE foodtype LIKE CONCAT('%%','%s','%%')", town));
//        sb.append(String.format("WHERE foodtype = '%s'", town));

        Map<String, Object> row = dbConnection.selectRow(sb.toString());

        if (row.isEmpty()) {
            return null;
        }

        return new DaejeonFood(row);
    }
}
