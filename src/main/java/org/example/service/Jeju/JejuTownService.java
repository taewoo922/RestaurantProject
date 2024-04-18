package org.example.service.Jeju;

import org.example.container.Container;
import org.example.dao.Jeju.JejuTownDao;
import org.example.dto.Jeju.JejuTown;
import org.example.dto.Seoul.SeoulTown;

import java.util.List;


public class JejuTownService {
    private JejuTownDao jejuTownDao;
    public JejuTownService() {
        jejuTownDao = Container.jejuTownDao;
    }
    public List<JejuTown> getJejuTownByResname(String foodtype, String town) {
        return jejuTownDao.getJejuTownByResname(foodtype, town);
    }
}
