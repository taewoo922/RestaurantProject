package org.example.service.Daegu;

import org.example.container.Container;
import org.example.dao.Daegu.DaeguDao;
import org.example.dto.Daegu.Daegu;

public class DaeguService {
    private DaeguDao daeguDao;
    public DaeguService() {
        daeguDao = Container.daeguDao;
    }

    public Daegu getDaeguByFood (String food) {

        return daeguDao.getDaeguByFood(food);
    }
}
