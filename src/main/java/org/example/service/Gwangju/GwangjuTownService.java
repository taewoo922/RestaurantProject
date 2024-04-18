package org.example.service.Gwangju;

import org.example.container.Container;
import org.example.dao.Gwangju.GwangjuTownDao;
import org.example.dto.Daejeon.DaejeonTown;
import org.example.dto.Gwangju.GwangjuTown;

import java.util.List;


public class GwangjuTownService {
    private GwangjuTownDao gwangjuTownDao;
    public GwangjuTownService() {
        gwangjuTownDao = Container.gwangjuTownDao;
    }

    public List<GwangjuTown> getGwangjuTownByResname(String foodtype, String town) {

        return gwangjuTownDao.getGwangjuTownByResname(foodtype, town);
    }
}
