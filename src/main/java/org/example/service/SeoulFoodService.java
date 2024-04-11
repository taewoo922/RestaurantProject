package org.example.service;

import org.example.Container;
import org.example.dao.SeoulFoodDao;
import org.example.dto.SeoulFood;

public class SeoulFoodService {
    private SeoulFoodDao seoulfoodDao;
    public SeoulFoodService() {
        seoulfoodDao =  Container.seoulFoodDao;
    }

    public SeoulFood getSeoulFoodByFoodType (String foodtype) {

        return seoulfoodDao.getSeoulFoodByFoodType(foodtype);
    }
}
