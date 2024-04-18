package org.example.dao.Daegu;

import org.example.container.Container;
import org.example.dao.Dao;
import org.example.db.DBConnection;
import org.example.dto.Daegu.DaeguTown;
import org.example.dto.Daejeon.DaejeonTown;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DaeguTownDao extends Dao {
    private DBConnection dbConnection;

    public DaeguTownDao() {
        dbConnection = Container.getDBConnection();
    }

    public List<DaeguTown> getDaeguTownByResname(String foodtype, String town) {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("SELECT * "));
        sb.append(String.format("FROM daeguTown "));
        sb.append(String.format("WHERE foodtype = '%s' ", foodtype));
        sb.append(String.format("AND town = '%s'", town));

        List<DaeguTown> daeguTowns = new ArrayList<>();
        List<Map<String, Object>> rows = dbConnection.selectRows(sb.toString());

        for ( Map<String, Object> row : rows ) {
            daeguTowns.add(new DaeguTown((row)));
        }

        return daeguTowns;
    }
}
