package org.example.service.Daejeon;

import org.example.Container;
import org.example.dao.Daejeon.DaejeonFoodDao;
import org.example.dao.Gyeonggi.GyeonggiFoodDao;
import org.example.dto.Daejeon.DaejeonFood;
import org.example.dto.Gyeonggi.GyeonggiFood;

public class DaejeonFoodService {
    private DaejeonFoodDao daejeonFoodDao;
    public DaejeonFoodService() {
        daejeonFoodDao =  Container.daejeonFoodDao;
    }

    public DaejeonFood getDaejeonFoodByFoodType (String foodtype) {

        return daejeonFoodDao.getDaejeonFoodByFoodType(foodtype);
    }
}
