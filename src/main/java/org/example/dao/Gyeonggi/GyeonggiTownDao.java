package org.example.dao.Gyeonggi;

import org.example.container.Container;
import org.example.dao.Dao;
import org.example.db.DBConnection;
import org.example.dto.Gyeonggi.GyeonggiTown;
import org.example.dto.Seoul.SeoulTown;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GyeonggiTownDao extends Dao {
    private DBConnection dbConnection;

    public GyeonggiTownDao() {
        dbConnection = Container.getDBConnection();
    }

    public int add(GyeonggiTown gyeonggiTown) {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("INSERT INTO gyeonggiTown "));
        sb.append(String.format("SET regDate = NOW(), "));
        sb.append(String.format("foodtype = '%s', ", gyeonggiTown.foodtype));
        sb.append(String.format("town = '%s', ", gyeonggiTown.town));
        sb.append(String.format("resname = '%s', ", gyeonggiTown.resname));
        sb.append(String.format("address = '%s', ", gyeonggiTown.address));
        sb.append(String.format("num = '%s', ", gyeonggiTown.num));
//        sb.append(String.format("boardId = %d", gyeonggiTown.boardId));

        return dbConnection.insert(sb.toString());
    }
    public List<GyeonggiTown> getGyeonggiTownByResname(String foodtype, String town) {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("SELECT * "));
        sb.append(String.format("FROM gyeonggiTown "));
        sb.append(String.format("WHERE foodtype = '%s' ", foodtype));
        sb.append(String.format("AND town = '%s'", town));

        List<GyeonggiTown> gyeonggiTown = new ArrayList<>();
        List<Map<String, Object>> rows = dbConnection.selectRows(sb.toString());

        for ( Map<String, Object> row : rows ) {
            gyeonggiTown.add(new GyeonggiTown((row)));
        }

        return gyeonggiTown;
    }
}
