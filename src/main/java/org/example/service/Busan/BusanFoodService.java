package org.example.service.Busan;

import org.example.container.Container;
import org.example.dao.Busan.BusanFoodDao;
import org.example.dto.Busan.BusanFood;

public class BusanFoodService {
    private BusanFoodDao busanFoodDao;
    public BusanFoodService() {
        busanFoodDao =  Container.busanFoodDao;
    }

    public BusanFood getBusanFoodByFoodType (String foodtype) {

        return busanFoodDao.getBusanFoodByFoodType(foodtype);
    }
}
