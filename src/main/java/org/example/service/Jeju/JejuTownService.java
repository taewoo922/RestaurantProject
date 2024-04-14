package org.example.service.Jeju;

import org.example.Container;
import org.example.dao.Jeju.JejuTownDao;
import org.example.dto.Jeju.JejuTown;


public class JejuTownService {
    private JejuTownDao jejuTownDao;
    public JejuTownService() {
        jejuTownDao = Container.jejuTownDao;
    }

    public JejuTown getJejuTownByResname (String resname) {

        return jejuTownDao.getJejuTownByResname(resname);
    }
}
