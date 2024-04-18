package org.example.dao.Busan;

import org.example.container.Container;
import org.example.dao.Dao;
import org.example.db.DBConnection;
import org.example.dto.Busan.BusanTown;
import org.example.dto.Daegu.DaeguTown;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BusanTownDao extends Dao {
    private DBConnection dbConnection;

    public BusanTownDao() {
        dbConnection = Container.getDBConnection();
    }

    public List<BusanTown> getBusanTownByResname(String foodtype, String town) {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("SELECT * "));
        sb.append(String.format("FROM busanTown "));
        sb.append(String.format("WHERE foodtype = '%s' ", foodtype));
        sb.append(String.format("AND town = '%s'", town));

        List<BusanTown> busanTowns = new ArrayList<>();
        List<Map<String, Object>> rows = dbConnection.selectRows(sb.toString());

        for ( Map<String, Object> row : rows ) {
            busanTowns.add(new BusanTown((row)));
        }

        return busanTowns;
    }
}
