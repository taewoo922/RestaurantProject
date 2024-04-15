package org.example.service.Busan;

import org.example.container.Container;
import org.example.dao.Busan.BusanDao;
import org.example.dto.Busan.Busan;

public class BusanService {
    private BusanDao busanDao;
    public BusanService() {
        busanDao = Container.busanDao;
    }

    public Busan getBusanByFood (String food) {

        return busanDao.getBusanByFood(food);
    }
}
