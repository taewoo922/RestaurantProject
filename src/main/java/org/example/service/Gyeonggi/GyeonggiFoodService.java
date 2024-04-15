package org.example.service.Gyeonggi;

import org.example.container.Container;
import org.example.dao.Gyeonggi.GyeonggiFoodDao;
import org.example.dto.Gyeonggi.GyeonggiFood;

public class GyeonggiFoodService {
    private GyeonggiFoodDao gyeonggifoodDao;
    public GyeonggiFoodService() {
        gyeonggifoodDao =  Container.gyeonggiFoodDao;
    }

    public GyeonggiFood getGyeonggiFoodByFoodType (String foodtype) {

        return gyeonggifoodDao.getGyeonggiFoodByFoodType(foodtype);
    }
}
