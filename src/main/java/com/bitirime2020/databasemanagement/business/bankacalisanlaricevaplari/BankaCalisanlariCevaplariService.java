package com.bitirime2020.databasemanagement.business.bankacalisanlaricevaplari;

import com.bitirime2020.databasemanagement.dao.bankacalisanlaricevaplari.IBankaCalisanlariCevaplariDAO;
import com.bitirime2020.databasemanagement.entities.BankaCalisanlariCevaplari;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankaCalisanlariCevaplariService implements IBankaCalisanlariCevaplariService {

    private IBankaCalisanlariCevaplariDAO iBankaCalisanlariCevaplariDAO;

    @Autowired
    public BankaCalisanlariCevaplariService(IBankaCalisanlariCevaplariDAO iBankaCalisanlariCevaplariDAO) {
        this.iBankaCalisanlariCevaplariDAO = iBankaCalisanlariCevaplariDAO;
    }

    @Override
    public List<BankaCalisanlariCevaplari> getAll() {
        return this.iBankaCalisanlariCevaplariDAO.getAll();
    }

    @Override
    public void add(BankaCalisanlariCevaplari bankaCalisanlariCevaplari) {
        this.iBankaCalisanlariCevaplariDAO.add(bankaCalisanlariCevaplari);
    }

    @Override
    public void update(BankaCalisanlariCevaplari bankaCalisanlariCevaplari) {
        this.iBankaCalisanlariCevaplariDAO.update(bankaCalisanlariCevaplari);
    }

    @Override
    public void delete(int id) {
        this.iBankaCalisanlariCevaplariDAO.delete(id);
    }

    @Override
    public BankaCalisanlariCevaplari getById(int id) {
        return this.iBankaCalisanlariCevaplariDAO.getById(id);
    }
}
