package org.example.service.Ulsan;

import org.example.Container;
import org.example.dao.Seoul.SeoulDao;
import org.example.dao.Ulsan.UlsanDao;
import org.example.dto.Seoul.Seoul;
import org.example.dto.Ulsan.Ulsan;

public class UlsanService {
    private UlsanDao ulsanDao;
    public UlsanService() {
        ulsanDao =  Container.ulsanDao;
    }

    public Ulsan getUlsanByFood (String food) {

        return ulsanDao.getUlsanByFood(food);
    }
}
