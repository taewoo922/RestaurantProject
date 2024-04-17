package org.example.dao.Seoul;

import org.example.container.Container;
import org.example.dao.Dao;
import org.example.db.DBConnection;
import org.example.dto.Seoul.SeoulTown;

import java.util.ArrayList;
import java.util.List;

public class SeoulTownDao extends Dao {
    public List<SeoulTown> seoulTowns;
//    private DBConnection dbConnection;

    public SeoulTownDao() {
        seoulTowns = new ArrayList<>();
//        dbConnection = Container.getDBConnection();
    }

    public int add(SeoulTown seoulTown) {
//        StringBuilder sb = new StringBuilder();
//
//        sb.append(String.format("INSERT INTO seoulTown "));
//        sb.append(String.format("SET regDate = NOW(), "));
//        sb.append(String.format("foodtype = '%s', ", seoulTown.foodtype));
//        sb.append(String.format("town = '%s', ", seoulTown.town));
//        sb.append(String.format("resname = '%s', ", seoulTown.resname));
//        sb.append(String.format("address = '%s', ", seoulTown.address));
//        sb.append(String.format("num = '%s', ", seoulTown.num));
//        sb.append(String.format("boardId = %d", seoulTown.boardId));
//
//        return dbConnection.insert(sb.toString());
        seoulTowns.add(seoulTown);
        lastId++;
        return 0;
    }

    public int getSeoulTownIndexByResname(String resname) {
        int i = 0;

        for ( SeoulTown seoulTown : seoulTowns ) {
            if ( seoulTown.town.equals(resname) ) {
                return i;
            }
            i++;
        }

        return -1;
    }
    public SeoulTown getSeoulTownByResname(String resname) {


        int index = getSeoulTownIndexByResname(resname);

        if ( index == -1 ) {
            return null;
        }

        return seoulTowns.get(index);
    }
}
