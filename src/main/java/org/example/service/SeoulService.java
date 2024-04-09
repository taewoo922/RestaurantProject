package org.example.service;

import org.example.Container;
import org.example.dao.MemberDao;
import org.example.dao.SeoulDao;
import org.example.dto.Seoul;

public class SeoulService {
    private SeoulDao seoulDao;
    public SeoulService () {
        seoulDao =  Container.seoulDao;
    }

    public String getSeoulByFood (String food) {
        return seoulDao.getSeoulByFood(food);
    }
}
