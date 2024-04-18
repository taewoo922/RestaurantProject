package org.example.service.Daegu;

import org.example.container.Container;
import org.example.dao.Daegu.DaeguTownDao;
import org.example.dto.Daegu.DaeguTown;
import org.example.dto.Daejeon.DaejeonTown;

import java.util.List;


public class DaeguTownService {
    private DaeguTownDao daeguTownDao;
    public DaeguTownService() {
        daeguTownDao = Container.daeguTownDao;
    }

    public List<DaeguTown> getDaeguTownByResname(String foodtype, String town) {

        return daeguTownDao.getDaeguTownByResname(foodtype, town);
    }
}
