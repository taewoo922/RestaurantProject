package org.example.dao.Incheon;

import org.example.container.Container;
import org.example.dao.Dao;
import org.example.db.DBConnection;
import org.example.dto.Gyeonggi.GyeonggiFood;
import org.example.dto.Incheon.IncheonFood;
import org.example.dto.Seoul.SeoulFood;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class IncheonFoodDao extends Dao {
    private DBConnection dbConnection;

    public IncheonFoodDao() {
        dbConnection = Container.getDBConnection();
    }

    public IncheonFood getIncheonFoodByFoodType(String town) {

        StringBuilder sb = new StringBuilder();

        sb.append(String.format("SELECT * "));
        sb.append(String.format("FROM incheonFood "));
        sb.append(String.format("WHERE foodtype = '%s'", town));

        Map<String, Object> row = dbConnection.selectRow(sb.toString());

        if (row.isEmpty()) {
            return null;
        }

        return new IncheonFood(row);
    }
}
