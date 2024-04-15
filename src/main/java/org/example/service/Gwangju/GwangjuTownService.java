package org.example.service.Gwangju;

import org.example.container.Container;
import org.example.dao.Gwangju.GwangjuTownDao;
import org.example.dto.Gwangju.GwangjuTown;


public class GwangjuTownService {
    private GwangjuTownDao gwangjuTownDao;
    public GwangjuTownService() {
        gwangjuTownDao = Container.gwangjuTownDao;
    }

    public GwangjuTown getGwangjuTownByResname (String resname) {

        return gwangjuTownDao.getGwangjuTownByResname(resname);
    }
}
