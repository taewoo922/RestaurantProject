package org.example.dao.Incheon;

import org.example.container.Container;
import org.example.dao.Dao;
import org.example.db.DBConnection;
import org.example.dto.Gyeonggi.GyeonggiTown;
import org.example.dto.Incheon.IncheonTown;
import org.example.dto.Seoul.SeoulTown;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class IncheonTownDao extends Dao {
    private DBConnection dbConnection;

    public IncheonTownDao() {
        dbConnection = Container.getDBConnection();
    }

    public List<IncheonTown> getIncheonTownByResname(String foodtype, String town) {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("SELECT * "));
        sb.append(String.format("FROM seoulTown "));
        sb.append(String.format("WHERE foodtype = '%s' ", foodtype));
        sb.append(String.format("AND town = '%s'", town));

        List<IncheonTown> incheonTowns = new ArrayList<>();
        List<Map<String, Object>> rows = dbConnection.selectRows(sb.toString());

        for ( Map<String, Object> row : rows ) {
            incheonTowns.add(new IncheonTown((row)));
        }


        return incheonTowns;
    }
}
