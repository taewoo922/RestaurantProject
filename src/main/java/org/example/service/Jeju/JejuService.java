package org.example.service.Jeju;

import org.example.Container;
import org.example.dao.Jeju.JejuDao;
import org.example.dto.Jeju.Jeju;

public class JejuService {
    private JejuDao jejuDao;
    public JejuService() {
        jejuDao =  Container.jejuDao;
    }

    public Jeju getJejuByFood (String food) {

        return jejuDao.getJejuByFood(food);
    }
}
