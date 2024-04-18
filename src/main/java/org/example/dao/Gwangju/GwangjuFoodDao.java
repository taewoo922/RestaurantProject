package org.example.dao.Gwangju;

import org.example.container.Container;
import org.example.dao.Dao;
import org.example.db.DBConnection;
import org.example.dto.Daegu.DaeguFood;
import org.example.dto.Gwangju.GwangjuFood;
import org.example.dto.Seoul.SeoulFood;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GwangjuFoodDao extends Dao {
    private DBConnection dbConnection;

    public GwangjuFoodDao() {
        dbConnection = Container.getDBConnection();
    }

    public GwangjuFood getGwangjuFoodByFoodType(String town) {

        StringBuilder sb = new StringBuilder();

        sb.append(String.format("SELECT * "));
        sb.append(String.format("FROM gwangjuFood "));
        sb.append(String.format("WHERE foodtype = '%s'", town));

        Map<String, Object> row = dbConnection.selectRow(sb.toString());

        if (row.isEmpty()) {
            return null;
        }

        return new GwangjuFood(row);
    }

}
