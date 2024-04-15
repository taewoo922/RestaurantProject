package org.example.service.Gyeonggi;

import org.example.container.Container;
import org.example.dao.Gyeonggi.GyeonggiDao;
import org.example.dto.Gyeonggi.Gyeonggi;

public class GyeonggiService {
    private GyeonggiDao gyeonggiDao;
    public GyeonggiService() {
        gyeonggiDao =  Container.gyeonggiDao;
    }

    public Gyeonggi getGyeonggiByFood (String food) {

        return gyeonggiDao.getGyeonggiByFood(food);
    }
}
