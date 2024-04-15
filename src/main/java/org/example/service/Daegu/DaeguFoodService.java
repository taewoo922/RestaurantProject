package org.example.service.Daegu;

import org.example.container.Container;
import org.example.dao.Daegu.DaeguFoodDao;
import org.example.dto.Daegu.DaeguFood;

public class DaeguFoodService {
    private DaeguFoodDao daeguFoodDao;
    public DaeguFoodService() {
        daeguFoodDao =  Container.daeguFoodDao;
    }

    public DaeguFood getDaeguFoodByFoodType (String foodtype) {

        return daeguFoodDao.getDaeguFoodByFoodType(foodtype);
    }
}
