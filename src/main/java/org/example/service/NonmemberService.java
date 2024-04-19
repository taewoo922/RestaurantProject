package org.example.service;

import org.example.container.Container;
import org.example.dao.MemberDao;
import org.example.dao.NonmemberDao;
import org.example.dto.Member;
import org.example.dto.NonMember;

public class NonmemberService {
    private NonmemberDao nonmemberDao;

    public NonmemberService() {
        nonmemberDao = Container.nonmemberDao;
    }

    public NonMember getrandommenu(String food) {
        return nonmemberDao.getrandommenu(food);
    }

}