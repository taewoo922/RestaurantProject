package org.example.service.Incheon;

import org.example.container.Container;
import org.example.dao.Incheon.IncheonTownDao;
import org.example.dto.Incheon.IncheonTown;


public class IncheonTownService {
    private IncheonTownDao incheonTownDao;
    public IncheonTownService() {
        incheonTownDao = Container.incheonTownDao;
    }

    public IncheonTown getIncheonTownByResname (String resname) {

        return incheonTownDao.getIncheonTownByResname(resname);
    }
}
