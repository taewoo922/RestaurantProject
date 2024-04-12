package org.example.service.Incheon;

import org.example.Container;
import org.example.dao.Gyeonggi.GyeonggiFoodDao;
import org.example.dao.Incheon.IncheonFoodDao;
import org.example.dto.Gyeonggi.GyeonggiFood;
import org.example.dto.Incheon.IncheonFood;

public class IncheonFoodService {
    private IncheonFoodDao incheonfoodDao;
    public IncheonFoodService() {
        incheonfoodDao =  Container.incheonFoodDao;
    }

    public IncheonFood getIncheonFoodByFoodType (String foodtype) {

        return incheonfoodDao.getIncheonFoodByFoodType(foodtype);
    }
}
