package org.example.dao.Jeju;

import org.example.container.Container;
import org.example.dao.Dao;
import org.example.db.DBConnection;
import org.example.dto.Jeju.Jeju;
import org.example.dto.Seoul.Seoul;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JejuDao extends Dao {
    private DBConnection dbConnection;

    public JejuDao() {
        dbConnection = Container.getDBConnection();
    }

    public Jeju getJejuByFood(String food) {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("SELECT * "));
        sb.append(String.format("FROM district "));
        sb.append(String.format("WHERE food = '%s'", food));

        Map<String, Object> row = dbConnection.selectRow(sb.toString());

        if ( row.isEmpty() ) {
            return null;
        }

        return new Jeju(row);
    }
}
