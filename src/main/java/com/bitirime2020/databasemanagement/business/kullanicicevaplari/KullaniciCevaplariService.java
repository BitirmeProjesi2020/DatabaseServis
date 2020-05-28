package com.bitirime2020.databasemanagement.business.kullanicicevaplari;

import com.bitirime2020.databasemanagement.entities.KullaniciCevaplari;
import com.bitirime2020.databasemanagement.dao.kullanicicevaplari.IKullaniciCevaplariDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class KullaniciCevaplariService implements IKullaniciCevaplariService {

    private IKullaniciCevaplariDAO iKullaniciCevaplariDAO;

    @Autowired
    public KullaniciCevaplariService(IKullaniciCevaplariDAO iKullaniciCevaplariDAO) {
        this.iKullaniciCevaplariDAO = iKullaniciCevaplariDAO;
    }

    @Override
    public List<KullaniciCevaplari> getAll() {
        return this.iKullaniciCevaplariDAO.getAll();
    }

    @Override
    public void add(KullaniciCevaplari kullaniciCevaplari) {
        this.iKullaniciCevaplariDAO.add(kullaniciCevaplari);
    }

    @Override
    public void update(KullaniciCevaplari kullaniciCevaplari) {
        this.iKullaniciCevaplariDAO.update(kullaniciCevaplari);
    }

    @Override
    public void delete(int id) {
        this.iKullaniciCevaplariDAO.delete(id);
    }

    @Override
    public KullaniciCevaplari getById(int id) {
        return this.iKullaniciCevaplariDAO.getById(id);
    }

    @Override
    public List<KullaniciCevaplari> getRecentSikayet(int sikayetid) {
        return this.iKullaniciCevaplariDAO.getRecentSikayet(sikayetid);
    }
}
