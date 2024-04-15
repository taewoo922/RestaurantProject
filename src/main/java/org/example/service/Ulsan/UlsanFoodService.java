package org.example.service.Ulsan;

import org.example.container.Container;
import org.example.dao.Ulsan.UlsanFoodDao;
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
