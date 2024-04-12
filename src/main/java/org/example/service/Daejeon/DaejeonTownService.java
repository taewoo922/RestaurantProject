package org.example.service.Daejeon;

import org.example.Container;
import org.example.dao.Daejeon.DaejeonTownDao;
import org.example.dao.Gyeonggi.GyeonggiTownDao;
import org.example.dto.Daejeon.DaejeonTown;
import org.example.dto.Gyeonggi.GyeonggiTown;


public class DaejeonTownService {
    private DaejeonTownDao daejeonTownDao;
    public DaejeonTownService() {
        daejeonTownDao = Container.daejeonTownDao;
    }

    public DaejeonTown getDaejeonTownByResname (String resname) {

        return daejeonTownDao.getDaejeonTownByResname(resname);
    }
}
