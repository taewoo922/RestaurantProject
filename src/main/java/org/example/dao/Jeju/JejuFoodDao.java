package org.example.dao.Jeju;

import org.example.container.Container;
import org.example.dao.Dao;
import org.example.db.DBConnection;
import org.example.dto.Jeju.JejuFood;
import org.example.dto.Seoul.SeoulFood;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JejuFoodDao extends Dao {
    private DBConnection dbConnection;

    public JejuFoodDao() {
        dbConnection = Container.getDBConnection();
    }

    public JejuFood getJejuFoodByFoodType(String town) {

        StringBuilder sb = new StringBuilder();

        sb.append(String.format("SELECT * "));
        sb.append(String.format("FROM jejuFood "));
        sb.append(String.format("WHERE foodtype = '%s'", town));

        Map<String, Object> row = dbConnection.selectRow(sb.toString());

        if (row.isEmpty()) {
            return null;
        }

        return new JejuFood(row);
    }
}
