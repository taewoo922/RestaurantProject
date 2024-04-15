package org.example.service.Gwangju;

import org.example.container.Container;
import org.example.dao.Gwangju.GwangjuDao;
import org.example.dto.Gwangju.Gwangju;

public class GwangjuService {
    private GwangjuDao gwamgjuDao;
    public GwangjuService() {
        gwamgjuDao =  Container.gwangjuDao;
    }

    public Gwangju getGwangjuByFood (String food) {

        return gwamgjuDao.getGwangjuByFood(food);
    }
}
