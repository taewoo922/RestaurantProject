package org.example.service.Seoul;

import org.example.Container;
import org.example.dao.Seoul.SeoulFoodDao;
import org.example.dto.Seoul.SeoulFood;

public class SeoulFoodService {
    private SeoulFoodDao seoulfoodDao;
    public SeoulFoodService() {
        seoulfoodDao =  Container.seoulFoodDao;
    }

    public SeoulFood getSeoulFoodByFoodType (String foodtype) {

        return seoulfoodDao.getSeoulFoodByFoodType(foodtype);
    }
}
