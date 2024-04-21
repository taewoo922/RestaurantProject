package org.example.service;

import org.example.container.Container;
import org.example.dao.MemberDao;
import org.example.dao.NonmemberDao;
import org.example.dto.Member;
import org.example.dto.NonMember;
import org.example.dto.Seoul.SeoulTown;

import java.util.List;

public class NonmemberService {
    private NonmemberDao nonmemberDao;

    public NonmemberService() {
        nonmemberDao = Container.nonmemberDao;
    }

//    public NonMember getrandommenu (String foodtype) {
//        return nonmemberDao.getrandommenu(foodtype);
//    }

    public List<NonMember> getrandommenu(String foodtype) {
        return nonmemberDao.getrandommenu(foodtype);
    }

}