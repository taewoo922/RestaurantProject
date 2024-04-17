package org.example.dao.Seoul;

import org.example.container.Container;
import org.example.dao.Dao;
import org.example.db.DBConnection;
import org.example.dto.Article;
import org.example.dto.Seoul.SeoulTown;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SeoulTownDao extends Dao {
    private DBConnection dbConnection;

    public SeoulTownDao() {
        dbConnection = Container.getDBConnection();
    }

    public int add(SeoulTown seoulTown) {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("INSERT INTO seoulTown "));
        sb.append(String.format("SET regDate = NOW(), "));
        sb.append(String.format("foodtype = '%s', ", seoulTown.foodtype));
        sb.append(String.format("town = '%s', ", seoulTown.town));
        sb.append(String.format("resname = '%s', ", seoulTown.resname));
        sb.append(String.format("address = '%s', ", seoulTown.address));
        sb.append(String.format("num = '%s', ", seoulTown.num));
        sb.append(String.format("boardId = %d", seoulTown.boardId));

        return dbConnection.insert(sb.toString());
    }

//    public SeoulTown getSeoulTownByResname(String foodtype, String town) {
//
//        StringBuilder sb = new StringBuilder();
//
//        sb.append(String.format("SELECT * "));
//        sb.append(String.format("FROM seoulTown "));
//        sb.append(String.format("WHERE foodtype = '%s' ", foodtype));
//        sb.append(String.format("AND town = '%s'", town));
//
//        Map<String, Object> row = dbConnection.selectRow(sb.toString());
//
//        if (row.isEmpty()) {
//            return null;
//        }
//        return new SeoulTown(row);
//
//    }
    public List<SeoulTown> getSeoulTownByResname(String foodtype, String town) {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("SELECT * "));
        sb.append(String.format("FROM seoulTown "));
        sb.append(String.format("WHERE foodtype = '%s' ", foodtype));
        sb.append(String.format("AND town = '%s'", town));

        List<SeoulTown> seoulTowns = new ArrayList<>();
        List<Map<String, Object>> rows = dbConnection.selectRows(sb.toString());

        for ( Map<String, Object> row : rows ) {
            seoulTowns.add(new SeoulTown((row)));
    }


        return seoulTowns;
    }
}
