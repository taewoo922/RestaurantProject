package org.example.service.Jeju;

import org.example.Container;
import org.example.dao.Jeju.JejuFoodDao;
import org.example.dto.Jeju.JejuFood;

public class JejuFoodService {
    private JejuFoodDao jejufoodDao;
    public JejuFoodService() {
        jejufoodDao =  Container.jejuFoodDao;
    }

    public JejuFood getJejuFoodByFoodType (String foodtype) {

        return jejufoodDao.getJejuFoodByFoodType(foodtype);
    }
}
