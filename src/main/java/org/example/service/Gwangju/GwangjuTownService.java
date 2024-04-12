package org.example.service.Gwangju;

import org.example.Container;
import org.example.dao.Gwangju.GwangjuTownDao;
import org.example.dao.Seoul.SeoulTownDao;
import org.example.dto.Gwangju.GwangjuTown;
import org.example.dto.Seoul.SeoulTown;


public class GwangjuTownService {
    private GwangjuTownDao gwangjuTownDao;
    public GwangjuTownService() {
        gwangjuTownDao = Container.gwangjuTownDao;
    }

    public GwangjuTown getGwangjuTownByResname (String resname) {

        return gwangjuTownDao.getGwangjuTownByResname(resname);
    }
}
