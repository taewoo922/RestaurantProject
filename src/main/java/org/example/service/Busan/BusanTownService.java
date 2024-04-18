package org.example.service.Busan;

import org.example.container.Container;
import org.example.dao.Busan.BusanTownDao;
import org.example.dto.Busan.BusanTown;
import org.example.dto.Daegu.DaeguTown;

import java.util.List;


public class BusanTownService {
    private BusanTownDao busanTownDao;
    public BusanTownService() {
        busanTownDao = Container.busanTownDao;
    }

    public List<BusanTown> getBusanTownByResname(String foodtype, String town) {

        return busanTownDao.getBusanTownByResname(foodtype, town);
    }
}
