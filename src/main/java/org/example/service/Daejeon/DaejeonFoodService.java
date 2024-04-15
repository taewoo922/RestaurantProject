package org.example.service.Daejeon;

import org.example.container.Container;
import org.example.dao.Daejeon.DaejeonFoodDao;
import org.example.dto.Daejeon.DaejeonFood;

public class DaejeonFoodService {
    private DaejeonFoodDao daejeonFoodDao;
    public DaejeonFoodService() {
        daejeonFoodDao =  Container.daejeonFoodDao;
    }

    public DaejeonFood getDaejeonFoodByFoodType (String foodtype) {

        return daejeonFoodDao.getDaejeonFoodByFoodType(foodtype);
    }
}
