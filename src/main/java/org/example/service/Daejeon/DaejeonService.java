package org.example.service.Daejeon;

import org.example.container.Container;
import org.example.dao.Daejeon.DaejeonDao;
import org.example.dto.Daejeon.Daejeon;

public class DaejeonService {
    private DaejeonDao daejeonDao;
    public DaejeonService() {
        daejeonDao =  Container.daejeonDao;
    }

    public Daejeon getDaejeonByFood (String food) {

        return daejeonDao.getDaejeonByFood(food);
    }
}
