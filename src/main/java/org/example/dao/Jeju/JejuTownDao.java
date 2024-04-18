package org.example.dao.Jeju;

import org.example.container.Container;
import org.example.dao.Dao;
import org.example.db.DBConnection;
import org.example.dto.Jeju.JejuTown;
import org.example.dto.Seoul.SeoulTown;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JejuTownDao extends Dao {
    private DBConnection dbConnection;

    public JejuTownDao() {
        dbConnection = Container.getDBConnection();
    }

    public List<JejuTown> getJejuTownByResname(String foodtype, String town) {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("SELECT * "));
        sb.append(String.format("FROM jejuTown "));
        sb.append(String.format("WHERE foodtype = '%s' ", foodtype));
        sb.append(String.format("AND town = '%s'", town));

        List<JejuTown> jejuTowns = new ArrayList<>();
        List<Map<String, Object>> rows = dbConnection.selectRows(sb.toString());

        for ( Map<String, Object> row : rows ) {
            jejuTowns.add(new JejuTown((row)));
        }


        return jejuTowns;
    }
}
