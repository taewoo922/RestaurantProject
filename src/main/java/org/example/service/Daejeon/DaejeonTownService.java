package org.example.service.Daejeon;

import org.example.Container;
import org.example.dao.Gyeonggi.GyeonggiTownDao;
import org.example.dto.Gyeonggi.GyeonggiTown;


public class DaejeonTownService {
    private GyeonggiTownDao gyeonggiTownDao;
    public DaejeonTownService() {
        gyeonggiTownDao = Container.gyeonggiTownDao;
    }

    public GyeonggiTown getGyeonggiTownByResname (String resname) {

        return gyeonggiTownDao.getGyeonggiTownByResname(resname);
    }
}
