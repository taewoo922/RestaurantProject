package org.example.service.Gwangju;

import org.example.Container;
import org.example.dao.Gwangju.GwangjuFoodDao;
import org.example.dao.Seoul.SeoulFoodDao;
import org.example.dto.Gwangju.GwangjuFood;
import org.example.dto.Seoul.SeoulFood;

public class GwangjuFoodService {
    private GwangjuFoodDao gwangjuFoodDao;
    public GwangjuFoodService() {
        gwangjuFoodDao =  Container.gwangjuFoodDao;
    }

    public GwangjuFood getGwangjuFoodByFoodType (String foodtype) {

        return gwangjuFoodDao.getGwangjuFoodByFoodType(foodtype);
    }
}
