package org.example.service.Ulsan;

import org.example.container.Container;
import org.example.dao.Ulsan.UlsanTownDao;
import org.example.dto.Seoul.SeoulTown;
import org.example.dto.Ulsan.UlsanTown;

import java.util.List;


public class UlsanTownService {
    private UlsanTownDao ulsanTownDao;
    public UlsanTownService() {
        ulsanTownDao = Container.ulsanTownDao;
    }

    public List<UlsanTown> getUlsanTownByResname(String foodtype, String town) {
        return ulsanTownDao.getUlsanTownByResname(foodtype, town);
    }
}
