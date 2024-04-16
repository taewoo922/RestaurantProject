package org.example.service.Seoul;

import org.example.container.Container;
import org.example.dao.Seoul.SeoulTownDao;
import org.example.dto.Article;
import org.example.dto.Seoul.SeoulTown;


public class SeoulTownService {
    private SeoulTownDao seoulTownDao;
    public SeoulTownService() {
        seoulTownDao = Container.seoulTownDao;
    }

    public int add(int id,  String foodtype, String town, String resname, String address, String num, int boardId) {
        SeoulTown seoulTown = new SeoulTown(id, foodtype,town, resname, address, num ,boardId);
        return seoulTownDao.add(seoulTown);
    }

    public SeoulTown getSeoulTownByResname (String resname) {

        return seoulTownDao.getSeoulTownByResname(resname);
    }
}
