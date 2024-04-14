package org.example.service.Ulsan;

import org.example.Container;
import org.example.dao.Seoul.SeoulFoodDao;
import org.example.dao.Ulsan.UlsanFoodDao;
import org.example.dto.Seoul.SeoulFood;
import org.example.dto.Ulsan.UlsanFood;

public class UlsanFoodService {
    private UlsanFoodDao ulsanfoodDao;
    public UlsanFoodService() {
        ulsanfoodDao =  Container.ulsanFoodDao;
    }

    public UlsanFood getUlsanFoodByFoodType (String foodtype) {

        return ulsanfoodDao.getUlsanFoodByFoodType(foodtype);
    }
}
