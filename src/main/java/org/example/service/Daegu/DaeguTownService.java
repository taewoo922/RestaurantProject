package org.example.service.Daegu;

import org.example.container.Container;
import org.example.dao.Daegu.DaeguTownDao;
import org.example.dto.Daegu.DaeguTown;


public class DaeguTownService {
    private DaeguTownDao daeguTownDao;
    public DaeguTownService() {
        daeguTownDao = Container.daeguTownDao;
    }

    public DaeguTown getDaeguTownByResname (String resname) {

        return daeguTownDao.getDaeguTownByResname(resname);
    }
}
