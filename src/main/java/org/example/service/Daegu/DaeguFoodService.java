package org.example.service.Daegu;

import org.example.Container;
import org.example.dao.Daegu.DaeguFoodDao;
import org.example.dao.Daejeon.DaejeonFoodDao;
import org.example.dto.Daegu.DaeguFood;
import org.example.dto.Daejeon.DaejeonFood;

public class DaeguFoodService {
    private DaeguFoodDao daeguFoodDao;
    public DaeguFoodService() {
        daeguFoodDao =  Container.daeguFoodDao;
    }

    public DaeguFood getDaeguFoodByFoodType (String foodtype) {

        return daeguFoodDao.getDaeguFoodByFoodType(foodtype);
    }
}
