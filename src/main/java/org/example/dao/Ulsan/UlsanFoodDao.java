package org.example.dao.Ulsan;

import org.example.container.Container;
import org.example.dao.Dao;
import org.example.db.DBConnection;
import org.example.dto.Incheon.IncheonFood;
import org.example.dto.Seoul.SeoulFood;
import org.example.dto.Ulsan.UlsanFood;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UlsanFoodDao extends Dao {
    private DBConnection dbConnection;

    public UlsanFoodDao() {
        dbConnection = Container.getDBConnection();
    }
    public UlsanFood getUlsanFoodByFoodType(String town) {

        StringBuilder sb = new StringBuilder();

        sb.append(String.format("SELECT * "));
        sb.append(String.format("FROM ulsanFood "));
        sb.append(String.format("WHERE foodtype LIKE CONCAT('%%','%s','%%')", town));
//        sb.append(String.format("WHERE foodtype = '%s'", town));

        Map<String, Object> row = dbConnection.selectRow(sb.toString());

        if (row.isEmpty()) {
            return null;
        }

        return new UlsanFood(row);
    }


}
