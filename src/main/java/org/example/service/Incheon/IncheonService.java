package org.example.service.Incheon;

import org.example.Container;
import org.example.dao.Gyeonggi.GyeonggiDao;
import org.example.dao.Incheon.IncheonDao;
import org.example.dto.Gyeonggi.Gyeonggi;
import org.example.dto.Incheon.Incheon;

public class IncheonService {
    private IncheonDao incheonDao;
    public IncheonService() {
        incheonDao =  Container.incheonDao;
    }

    public Incheon getIncheonByFood (String food) {

        return incheonDao.getIncheonByFood(food);
    }
}
