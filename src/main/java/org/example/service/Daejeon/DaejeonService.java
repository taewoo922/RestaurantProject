package org.example.service.Daejeon;

import org.example.Container;
import org.example.dao.Gyeonggi.GyeonggiDao;
import org.example.dto.Gyeonggi.Gyeonggi;

public class DaejeonService {
    private GyeonggiDao gyeonggiDao;
    public DaejeonService() {
        gyeonggiDao =  Container.gyeonggiDao;
    }

    public Gyeonggi getGyeonggiByFood (String food) {

        return gyeonggiDao.getGyeonggiByFood(food);
    }
}
