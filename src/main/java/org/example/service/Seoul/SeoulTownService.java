package org.example.service.Seoul;

import org.example.Container;
import org.example.dao.Seoul.SeoulTownDao;
import org.example.dto.Seoul.SeoulTown;


public class SeoulTownService {
    private SeoulTownDao seoulTownDao;
    public SeoulTownService() {
        seoulTownDao = Container.seoulTownDao;
    }

    public SeoulTown getSeoulTownByResname (String resname) {

        return seoulTownDao.getSeoulTownByResname(resname);
    }
}
