package org.example.dao.Gwangju;

import org.example.container.Container;
import org.example.dao.Dao;
import org.example.db.DBConnection;
import org.example.dto.Daejeon.DaejeonTown;
import org.example.dto.Gwangju.GwangjuTown;
import org.example.dto.Seoul.SeoulTown;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GwangjuTownDao extends Dao {
    private DBConnection dbConnection;

    public GwangjuTownDao() {
        dbConnection = Container.getDBConnection();
    }

    public List<GwangjuTown> getGwangjuTownByResname(String foodtype, String town) {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("SELECT * "));
        sb.append(String.format("FROM gwangjuTown "));
        sb.append(String.format("WHERE foodtype = '%s' ", foodtype));
        sb.append(String.format("AND town = '%s'", town));

        List<GwangjuTown> gwangjuTowns = new ArrayList<>();
        List<Map<String, Object>> rows = dbConnection.selectRows(sb.toString());

        for ( Map<String, Object> row : rows ) {
            gwangjuTowns.add(new GwangjuTown((row)));
        }

        return gwangjuTowns;
    }

}
