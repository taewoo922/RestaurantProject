package org.example.service.Daejeon;

import org.example.Container;
import org.example.dao.Gyeonggi.GyeonggiFoodDao;
import org.example.dto.Gyeonggi.GyeonggiFood;

public class DaejeonFoodService {
    private GyeonggiFoodDao gyeonggifoodDao;
    public DaejeonFoodService() {
        gyeonggifoodDao =  Container.gyeonggiFoodDao;
    }

    public GyeonggiFood getGyeonggiFoodByFoodType (String foodtype) {

        return gyeonggifoodDao.getGyeonggiFoodByFoodType(foodtype);
    }
}
