package org.example.service;

import org.example.Container;
import org.example.dao.SeoulTownDao;
import org.example.dto.SeoulTown;


public class SeoulTownService {
    private SeoulTownDao seoulTownDao;
    public SeoulTownService() {
        seoulTownDao = Container.seoulTownDao;
    }

    public SeoulTown getSeoulTownByResname (String resname) {

        return seoulTownDao.getSeoulTownByResname(resname);
    }
}
