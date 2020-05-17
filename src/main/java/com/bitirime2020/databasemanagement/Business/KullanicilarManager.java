package com.bitirime2020.databasemanagement.Business;

import com.bitirime2020.databasemanagement.DAO.IKullanicilarDAO;
import com.bitirime2020.databasemanagement.Entities.Kullanicilar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class KullanicilarManager implements IKullanicilarService {

    private IKullanicilarDAO iKullanicilarDAO;

    @Autowired
    public KullanicilarManager(IKullanicilarDAO iKullanicilarDAO) {
        this.iKullanicilarDAO = iKullanicilarDAO;
    }

    @Override
    @Transactional
    public List<Kullanicilar> getAll() {
        return this.iKullanicilarDAO.getAll();
    }

    @Override
    @Transactional
    public void add(Kullanicilar kullanicilar) {
        this.iKullanicilarDAO.add(kullanicilar);
    }

    @Override
    @Transactional
    public void update(Kullanicilar kullanicilar) {
        this.iKullanicilarDAO.update(kullanicilar);
    }

    @Override
    @Transactional
    public void delete(int id) {
        this.iKullanicilarDAO.delete(id);
    }

    @Override
    public Kullanicilar getById(int id) {
        return this.iKullanicilarDAO.getById(id);
    }
}
