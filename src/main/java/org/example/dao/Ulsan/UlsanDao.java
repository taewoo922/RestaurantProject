package org.example.dao.Ulsan;

import org.example.container.Container;
import org.example.dao.Dao;
import org.example.db.DBConnection;
import org.example.dto.Incheon.Incheon;
import org.example.dto.Seoul.Seoul;
import org.example.dto.Ulsan.Ulsan;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UlsanDao extends Dao {
    private DBConnection dbConnection;

    public UlsanDao() {
        dbConnection = Container.getDBConnection();
    }

    public Ulsan getUlsanByFood(String food) {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("SELECT * "));
        sb.append(String.format("FROM district "));
        sb.append(String.format("WHERE food = '%s'", food));

        Map<String, Object> row = dbConnection.selectRow(sb.toString());

        if ( row.isEmpty() ) {
            return null;
        }

        return new Ulsan(row);
    }
}
