package org.example.dao.Daegu;

import org.example.container.Container;
import org.example.dao.Dao;
import org.example.db.DBConnection;
import org.example.dto.Daegu.DaeguFood;
import org.example.dto.Daejeon.DaejeonFood;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DaeguFoodDao extends Dao {
    private DBConnection dbConnection;

    public DaeguFoodDao() {
        dbConnection = Container.getDBConnection();
    }

    public DaeguFood getDaeguFoodByFoodType(String town) {

        StringBuilder sb = new StringBuilder();

        sb.append(String.format("SELECT * "));
        sb.append(String.format("FROM daeguFood "));
        sb.append(String.format("WHERE foodtype LIKE CONCAT('%%','%s','%%')", town));
//        sb.append(String.format("WHERE foodtype = '%s'", town));


        Map<String, Object> row = dbConnection.selectRow(sb.toString());

        if (row.isEmpty()) {
            return null;
        }

        return new DaeguFood(row);
    }
}
