package org.example.service.Daegu;

import org.example.Container;
import org.example.dao.Daegu.DaeguDao;
import org.example.dao.Daejeon.DaejeonDao;
import org.example.dto.Daegu.Daegu;
import org.example.dto.Daejeon.Daejeon;

public class DaeguService {
    private DaeguDao daeguDao;
    public DaeguService() {
        daeguDao = Container.daeguDao;
    }

    public Daegu getDaeguByFood (String food) {

        return daeguDao.getDaeguByFood(food);
    }
}
