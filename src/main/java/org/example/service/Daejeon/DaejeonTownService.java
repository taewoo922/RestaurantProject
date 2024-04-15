package org.example.service.Daejeon;

import org.example.container.Container;
import org.example.dao.Daejeon.DaejeonTownDao;
import org.example.dto.Daejeon.DaejeonTown;


public class DaejeonTownService {
    private DaejeonTownDao daejeonTownDao;
    public DaejeonTownService() {
        daejeonTownDao = Container.daejeonTownDao;
    }

    public DaejeonTown getDaejeonTownByResname (String resname) {

        return daejeonTownDao.getDaejeonTownByResname(resname);
    }
}
