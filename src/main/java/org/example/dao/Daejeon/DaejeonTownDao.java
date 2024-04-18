package org.example.dao.Daejeon;

import org.example.container.Container;
import org.example.dao.Dao;
import org.example.db.DBConnection;
import org.example.dto.Daejeon.DaejeonTown;
import org.example.dto.Gyeonggi.GyeonggiTown;
import org.example.dto.Seoul.SeoulTown;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DaejeonTownDao extends Dao {
    private DBConnection dbConnection;

    public DaejeonTownDao() {
        dbConnection = Container.getDBConnection();
    }


    public List<DaejeonTown> getDaejeonTownByResname(String foodtype, String town) {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("SELECT * "));
        sb.append(String.format("FROM daejeonTown "));
        sb.append(String.format("WHERE foodtype = '%s' ", foodtype));
        sb.append(String.format("AND town = '%s'", town));

        List<DaejeonTown> daejeonTowns = new ArrayList<>();
        List<Map<String, Object>> rows = dbConnection.selectRows(sb.toString());

        for ( Map<String, Object> row : rows ) {
            daejeonTowns.add(new DaejeonTown((row)));
        }

        return daejeonTowns;
    }

}
