package org.example.service.Gyeonggi;

import org.example.Container;
import org.example.dao.Gyeonggi.GyeonggiFoodDao;
import org.example.dao.Seoul.SeoulFoodDao;
import org.example.dto.Gyeonggi.GyeonggiFood;
import org.example.dto.Seoul.SeoulFood;

public class GyeonggiFoodService {
    private GyeonggiFoodDao gyeonggifoodDao;
    public GyeonggiFoodService() {
        gyeonggifoodDao =  Container.gyeonggiFoodDao;
    }

    public GyeonggiFood getGyeonggiFoodByFoodType (String foodtype) {

        return gyeonggifoodDao.getGyeonggiFoodByFoodType(foodtype);
    }
}
