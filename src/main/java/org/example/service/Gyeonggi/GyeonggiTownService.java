package org.example.service.Gyeonggi;

import org.example.Container;
import org.example.dao.Gyeonggi.GyeonggiTownDao;
import org.example.dao.Seoul.SeoulTownDao;
import org.example.dto.Gyeonggi.GyeonggiTown;
import org.example.dto.Seoul.SeoulTown;


public class GyeonggiTownService {
    private GyeonggiTownDao gyeonggiTownDao;
    public GyeonggiTownService() {
        gyeonggiTownDao = Container.gyeonggiTownDao;
    }

    public GyeonggiTown getGyeonggiTownByResname (String resname) {

        return gyeonggiTownDao.getGyeonggiTownByResname(resname);
    }
}
