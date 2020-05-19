package com.bitirime2020.databasemanagement.business.bankakategorileri;

import com.bitirime2020.databasemanagement.dao.bankakategorileri.IBankaKategorileriDAO;
import com.bitirime2020.databasemanagement.entities.BankaKategorileri;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BankaKategorileriService implements IBankaKategorileriService {

    private IBankaKategorileriDAO iBankaKategorileriDAO;

    @Autowired
    public BankaKategorileriService(IBankaKategorileriDAO iBankaKategorileriDAO) {
        this.iBankaKategorileriDAO = iBankaKategorileriDAO;
    }

    @Override
    @Transactional
    public List<BankaKategorileri> getAll() {
        return this.iBankaKategorileriDAO.getAll();
    }

    @Override
    @Transactional
    public void add(BankaKategorileri bankaKategorileri) {
        this.iBankaKategorileriDAO.add(bankaKategorileri);
    }

    @Override
    @Transactional
    public void update(BankaKategorileri bankaKategorileri) {
        this.iBankaKategorileriDAO.add(bankaKategorileri);
    }

    @Override
    @Transactional
    public void delete(int id) {
        this.iBankaKategorileriDAO.delete(id);
    }

    @Override
    @Transactional
    public BankaKategorileri getById(int id) {
        return this.iBankaKategorileriDAO.getById(id);
    }
}
