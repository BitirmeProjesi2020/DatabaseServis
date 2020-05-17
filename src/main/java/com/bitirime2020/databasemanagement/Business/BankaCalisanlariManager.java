package com.bitirime2020.databasemanagement.Business;

import com.bitirime2020.databasemanagement.DAO.IBankaCalisanlariDAO;
import com.bitirime2020.databasemanagement.Entities.BankaCalisanlari;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BankaCalisanlariManager implements IBankaCalisanlariService {

    private IBankaCalisanlariDAO iBankaCalisanlariDAO;

    @Autowired
    public BankaCalisanlariManager(IBankaCalisanlariDAO iBankaCalisanlariDAO) {
        this.iBankaCalisanlariDAO = iBankaCalisanlariDAO;
    }

    @Override
    @Transactional
    public List<BankaCalisanlari> getAll() {
        return this.iBankaCalisanlariDAO.getAll();
    }

    @Override
    @Transactional
    public void add(BankaCalisanlari bankaCalisanlari) {
        this.iBankaCalisanlariDAO.add(bankaCalisanlari);
    }

    @Override
    @Transactional
    public void update(BankaCalisanlari bankaCalisanlari) {
        this.iBankaCalisanlariDAO.update(bankaCalisanlari);
    }

    @Override
    @Transactional
    public void delete(int id) {
        this.iBankaCalisanlariDAO.delete(id);
    }

    @Override
    @Transactional
    public BankaCalisanlari getById(int id) {
        return this.iBankaCalisanlariDAO.getById(id);
    }
}
