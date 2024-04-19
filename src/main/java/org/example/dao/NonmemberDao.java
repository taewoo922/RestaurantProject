package org.example.dao;

import org.example.container.Container;
import org.example.db.DBConnection;
import org.example.dto.Member;
import org.example.dto.NonMember;

import java.util.Map;

public class NonmemberDao extends Dao {

    private DBConnection dbConnection;
    public NonmemberDao() {
        dbConnection = Container.getDBConnection();
    }

//    public int join(Member member) {
//        StringBuilder sb = new StringBuilder();
//
//        sb.append(String.format("INSERT INTO `member` "));
//        sb.append(String.format("SET regDate = NOW(), "));
//        sb.append(String.format("updateDate = NOW(), "));
//        sb.append(String.format("loginId = '%s', ", member.loginId));
//        sb.append(String.format("loginPassword = '%s', ", member.loginPassword));
//        sb.append(String.format("`name` = '%s' ", member.name));
//
//        return dbConnection.insert(sb.toString());
//    }


    public NonMember getrandommenu(String food) {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("SELECT * "));
        sb.append(String.format("FROM `nonmember` "));
        sb.append(String.format("WHERE randommenu = '%s'", food));
//        select *  from photo order by rand() limit 1;
        Map<String, Object> row = dbConnection.selectRow((sb.toString()));

        if ( row.isEmpty() ) {
            return null;
        }

        return new NonMember(row);
    }

}