package org.example.dao;

import org.example.container.Container;
import org.example.db.DBConnection;
import org.example.dto.Member;
import org.example.dto.NonMember;
import org.example.dto.Seoul.SeoulTown;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class NonmemberDao extends Dao {

    private DBConnection dbConnection;
    public NonmemberDao() {
        dbConnection = Container.getDBConnection();
    }

//    public NonMember getrandommenu(String food) {
//        StringBuilder sb = new StringBuilder();
//
////        sb.append(String.format("SELECT * "));
////        sb.append(String.format("FROM `nonmember` "));
////        sb.append(String.format("WHERE foodtype = '%s'", food));
//        sb.append(String.format("SELECT * "));
//        sb.append(String.format("FROM nonmember "));
//        sb.append(String.format("WHERE foodtype = '%s' ", food));
//        sb.append(String.format("ORDER BY RAND() LIMIT 1 "));
////        select *  from photo order by rand() limit 1;
//        Map<String, Object> row = dbConnection.selectRow((sb.toString()));
//
//        if ( row.isEmpty() ) {
//            return null;
//        }
//
//        return new NonMember(row);
//    }

    public List<NonMember> getrandommenu(String foodtype) {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("SELECT * "));
        sb.append(String.format("FROM nonmember "));
        sb.append(String.format("WHERE foodtype = '%s' ", foodtype));
        sb.append(String.format("ORDER BY RAND() LIMIT 1"));

        List<NonMember> nonMembers = new ArrayList<>();
        List<Map<String, Object>> rows = dbConnection.selectRows(sb.toString());

        for ( Map<String, Object> row : rows ) {
            nonMembers.add(new NonMember((row)));
        }


        return nonMembers;
    }

}