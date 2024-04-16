package org.example.dao.Seoul;

import org.example.container.Container;
import org.example.dao.Dao;
import org.example.db.DBConnection;
import org.example.dto.Seoul.Seoul;

import java.util.ArrayList;
import java.util.List;

public class SeoulDao extends Dao {
    public List<Seoul> seouls;
//    private DBConnection dbConnection;
    public SeoulDao() {
        seouls = new ArrayList<>();
//        dbConnection = Container.getDBConnection();
    }

    public void add(Seoul seoul) {
        seouls.add(seoul);
        lastId++;
//        StringBuilder sb = new StringBuilder();
//
//
//        sb.append(String.format("INSERT INTO article "));
//        sb.append(String.format("SET regDate = NOW(), "));
//        sb.append(String.format("updateDate = NOW(), "));
//        sb.append(String.format("title = '%s', ", district.title));
//        sb.append(String.format("`body` = '%s', ", district.body));
//        sb.append(String.format("memberId = %d, ", district.memberId));
//        sb.append(String.format("boardId = %d, ", district.boardId));
//        sb.append(String.format("hit = %d ", district.hit));
//
//        return dbConnection.insert(sb.toString());
    }

    public int getSeoulIndexByFood(String food) {
        int i = 0;

        for ( Seoul seoul : seouls ) {
            if ( seoul.food.equals(food) ) {
                return i;
            }
            i++;
        }

        return -1;
    }
    public Seoul getSeoulByFood(String menu) {


        int index = getSeoulIndexByFood(menu);

        if ( index == -1 ) {
            return null;
        }

        return seouls.get(index);
    }
}
