package org.example.service.Gyeonggi;

import org.example.Container;
import org.example.dao.Gyeonggi.GyeonggiDao;
import org.example.dao.Seoul.SeoulDao;
import org.example.dto.Gyeonggi.Gyeonggi;
import org.example.dto.Seoul.Seoul;

public class GyeonggiService {
    private GyeonggiDao gyeonggiDao;
    public GyeonggiService() {
        gyeonggiDao =  Container.gyeonggiDao;
    }

    public Gyeonggi getGyeonggiByFood (String food) {

        return gyeonggiDao.getGyeonggiByFood(food);
    }
}
