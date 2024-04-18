package org.example.dao.Ulsan;

import org.example.container.Container;
import org.example.dao.Dao;
import org.example.db.DBConnection;
import org.example.dto.Incheon.IncheonTown;
import org.example.dto.Seoul.SeoulTown;
import org.example.dto.Ulsan.UlsanTown;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UlsanTownDao extends Dao {
    private DBConnection dbConnection;

    public UlsanTownDao() {
        dbConnection = Container.getDBConnection();
    }

    public List<UlsanTown> getUlsanTownByResname(String foodtype, String town) {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("SELECT * "));
        sb.append(String.format("FROM ulsanTown "));
        sb.append(String.format("WHERE foodtype = '%s' ", foodtype));
        sb.append(String.format("AND town = '%s'", town));

        List<UlsanTown> ulsanTowns = new ArrayList<>();
        List<Map<String, Object>> rows = dbConnection.selectRows(sb.toString());

        for ( Map<String, Object> row : rows ) {
            ulsanTowns.add(new UlsanTown((row)));
        }


        return ulsanTowns;
    }
}
