package org.example.service.Busan;

import org.example.container.Container;
import org.example.dao.Busan.BusanTownDao;
import org.example.dto.Busan.BusanTown;


public class BusanTownService {
    private BusanTownDao busanTownDao;
    public BusanTownService() {
        busanTownDao = Container.busanTownDao;
    }

    public BusanTown getBusanTownByResname (String resname) {

        return busanTownDao.getBusanTownByResname(resname);
    }
}
