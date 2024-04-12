package org.example.service.Daegu;

import org.example.Container;
import org.example.dao.Daegu.DaeguTownDao;
import org.example.dao.Daejeon.DaejeonTownDao;
import org.example.dto.Daegu.DaeguTown;
import org.example.dto.Daejeon.DaejeonTown;


public class DaeguTownService {
    private DaeguTownDao daeguTownDao;
    public DaeguTownService() {
        daeguTownDao = Container.daeguTownDao;
    }

    public DaeguTown getDaeguTownByResname (String resname) {

        return daeguTownDao.getDaeguTownByResname(resname);
    }
}
