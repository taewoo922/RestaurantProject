package org.example.service.Ulsan;

import org.example.container.Container;
import org.example.dao.Ulsan.UlsanTownDao;
import org.example.dto.Ulsan.UlsanTown;


public class UlsanTownService {
    private UlsanTownDao ulsanTownDao;
    public UlsanTownService() {
        ulsanTownDao = Container.ulsanTownDao;
    }

    public UlsanTown getUlsanTownByResname (String resname) {

        return ulsanTownDao.getUlsanTownByResname(resname);
    }
}
