package org.example.dao.Seoul;

import org.example.container.Container;
import org.example.dao.Dao;
import org.example.db.DBConnection;
import org.example.dto.Article;
import org.example.dto.Seoul.Seoul;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SeoulDao extends Dao {
    private DBConnection dbConnection;
    public SeoulDao() {
        dbConnection = Container.getDBConnection();
    }

    public Seoul getForSeoulFood(int id) {
    StringBuilder sb = new StringBuilder();

    sb.append(String.format("SELECT A.*, M.name AS writerName "));
    sb.append(String.format("FROM district AS A "));
    sb.append(String.format("INNER JOIN `member` AS M "));
    sb.append(String.format("ON A.memberId = M.id "));
    sb.append(String.format("WHERE A.id = %d ", id));

    Map<String, Object> row = dbConnection.selectRow(sb.toString());

    if ( row.isEmpty() ) {
        return null;
    }

    return new Seoul(row);
}

    public Seoul getSeouls(String food) {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("SELECT * "));
        sb.append(String.format("FROM district "));
        sb.append(String.format("WHERE food = '%s'", food));

        Map<String, Object> row = dbConnection.selectRow(sb.toString());

        if ( row.isEmpty() ) {
            return null;
        }

        return new Seoul(row);
    }
}
