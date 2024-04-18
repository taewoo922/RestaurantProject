package org.example.dao.Busan;

import org.example.container.Container;
import org.example.dao.Dao;
import org.example.db.DBConnection;
import org.example.dto.Busan.Busan;
import org.example.dto.Daegu.Daegu;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BusanDao extends Dao {
    private DBConnection dbConnection;

    public BusanDao() {
        dbConnection = Container.getDBConnection();
    }

    public Busan getBusanByFood(String food) {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("SELECT * "));
        sb.append(String.format("FROM district "));
        sb.append(String.format("WHERE food = '%s'", food));

        Map<String, Object> row = dbConnection.selectRow(sb.toString());

        if ( row.isEmpty() ) {
            return null;
        }

        return new Busan(row);
    }
}
