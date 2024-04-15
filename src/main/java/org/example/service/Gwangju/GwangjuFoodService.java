package org.example.service.Gwangju;

import org.example.container.Container;
import org.example.dao.Gwangju.GwangjuFoodDao;
import org.example.dto.Gwangju.GwangjuFood;

public class GwangjuFoodService {
    private GwangjuFoodDao gwangjuFoodDao;
    public GwangjuFoodService() {
        gwangjuFoodDao =  Container.gwangjuFoodDao;
    }

    public GwangjuFood getGwangjuFoodByFoodType (String foodtype) {

        return gwangjuFoodDao.getGwangjuFoodByFoodType(foodtype);
    }
}
