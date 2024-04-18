package org.example.dao.Daejeon;

import org.example.container.Container;
import org.example.dao.Dao;
import org.example.db.DBConnection;
import org.example.dto.Daejeon.Daejeon;
import org.example.dto.Gyeonggi.Gyeonggi;
import org.example.dto.Seoul.Seoul;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DaejeonDao extends Dao {
    private DBConnection dbConnection;

    public DaejeonDao() {
        dbConnection = Container.getDBConnection();
    }



    public Daejeon getDaejeonByFood(String food) {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("SELECT * "));
        sb.append(String.format("FROM district "));
        sb.append(String.format("WHERE food = '%s'", food));

        Map<String, Object> row = dbConnection.selectRow(sb.toString());

        if ( row.isEmpty() ) {
            return null;
        }

        return new Daejeon(row);
    }
}
