package org.example.service;

import org.example.container.Container;
import org.example.dao.DistrictDao;

public class DistrictService {
    private DistrictDao districtDao;
    public DistrictService() {
        districtDao = Container.districtDao;
    }
//    public String getDistrictByState(String state) {
//        return districtDao.getDistrictByState(state);
//    }
}
