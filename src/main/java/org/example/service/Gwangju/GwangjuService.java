package org.example.service.Gwangju;

import org.example.Container;
import org.example.dao.Gwangju.GwangjuDao;
import org.example.dao.Seoul.SeoulDao;
import org.example.dto.Gwangju.Gwangju;
import org.example.dto.Seoul.Seoul;

public class GwangjuService {
    private GwangjuDao gwamgjuDao;
    public GwangjuService() {
        gwamgjuDao =  Container.gwangjuDao;
    }

    public Gwangju getGwangjuByFood (String food) {

        return gwamgjuDao.getGwangjuByFood(food);
    }
}
