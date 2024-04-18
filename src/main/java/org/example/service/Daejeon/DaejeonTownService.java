package org.example.service.Daejeon;

import org.example.container.Container;
import org.example.dao.Daejeon.DaejeonTownDao;
import org.example.dto.Daejeon.DaejeonTown;
import org.example.dto.Incheon.IncheonTown;

import java.util.List;


public class DaejeonTownService {
    private DaejeonTownDao daejeonTownDao;
    public DaejeonTownService() {
        daejeonTownDao = Container.daejeonTownDao;
    }

    public List<DaejeonTown> getDaejeonTownByResname(String foodtype, String town) {

        return daejeonTownDao.getDaejeonTownByResname(foodtype, town);
    }
}
