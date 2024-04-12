package org.example.service.Daejeon;

import org.example.Container;
import org.example.dao.Daejeon.DaejeonDao;
import org.example.dao.Gyeonggi.GyeonggiDao;
import org.example.dto.Daejeon.Daejeon;
import org.example.dto.Gyeonggi.Gyeonggi;

public class DaejeonService {
    private DaejeonDao daejeonDao;
    public DaejeonService() {
        daejeonDao =  Container.daejeonDao;
    }

    public Daejeon getDaejeonByFood (String food) {

        return daejeonDao.getDaejeonByFood(food);
    }
}
