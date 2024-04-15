package org.example.service.Gyeonggi;

import org.example.container.Container;
import org.example.dao.Gyeonggi.GyeonggiTownDao;
import org.example.dto.Gyeonggi.GyeonggiTown;


public class GyeonggiTownService {
    private GyeonggiTownDao gyeonggiTownDao;
    public GyeonggiTownService() {
        gyeonggiTownDao = Container.gyeonggiTownDao;
    }

    public GyeonggiTown getGyeonggiTownByResname (String resname) {

        return gyeonggiTownDao.getGyeonggiTownByResname(resname);
    }
}
