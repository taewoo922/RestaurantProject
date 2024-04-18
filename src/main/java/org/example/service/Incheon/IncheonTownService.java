package org.example.service.Incheon;

import org.example.container.Container;
import org.example.dao.Incheon.IncheonTownDao;
import org.example.dto.Incheon.IncheonTown;
import org.example.dto.Seoul.SeoulTown;

import java.util.List;


public class IncheonTownService {
    private IncheonTownDao incheonTownDao;
    public IncheonTownService() {
        incheonTownDao = Container.incheonTownDao;
    }

    public List<IncheonTown> getIncheonTownByResname(String foodtype, String town) {
        return incheonTownDao.getIncheonTownByResname(foodtype, town);
    }
}
