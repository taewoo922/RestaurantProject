package org.example.service.Gyeonggi;

import org.example.container.Container;
import org.example.dao.Gyeonggi.GyeonggiTownDao;
import org.example.dto.Gyeonggi.GyeonggiTown;
import org.example.dto.Seoul.SeoulTown;

import java.util.List;


public class GyeonggiTownService {
    private GyeonggiTownDao gyeonggiTownDao;
    public GyeonggiTownService() {
        gyeonggiTownDao = Container.gyeonggiTownDao;
    }

    public List<GyeonggiTown> getGyeonggiTownByResname(String foodtype, String town) {
        return gyeonggiTownDao.getGyeonggiTownByResname(foodtype, town);
    }
}
