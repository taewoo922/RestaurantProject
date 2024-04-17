package org.example.service.Seoul;

import org.example.container.Container;
import org.example.dao.Seoul.SeoulDao;
import org.example.dto.Seoul.Seoul;

public class SeoulService {
    private SeoulDao seoulDao;
    public SeoulService () {
        seoulDao =  Container.seoulDao;
    }

    public Seoul getSeoulByFood (String food) {

        return seoulDao.getSeouls(food);
    }

//    public Seoul getSeoulByFood (String food) {
//
//        return seoulDao.getSeoulByFood(food);
//    }
}
