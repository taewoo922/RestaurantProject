package org.example.service;

import org.example.Container;
import org.example.dao.DistrictDao;
import org.example.dao.MemberDao;


import java.util.Scanner;

public class DistrictService {
    private DistrictDao districtDao;
    public DistrictService() {
        districtDao = Container.districtDao;
    }
//    public String getDistrictByState(String state) {
//        return districtDao.getDistrictByState(state);
//    }
}
