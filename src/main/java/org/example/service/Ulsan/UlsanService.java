package org.example.service.Ulsan;

import org.example.container.Container;
import org.example.dao.Ulsan.UlsanDao;
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
