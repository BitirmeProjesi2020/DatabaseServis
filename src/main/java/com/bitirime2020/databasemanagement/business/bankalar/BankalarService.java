package com.bitirime2020.databasemanagement.business.bankalar;

import com.bitirime2020.databasemanagement.dao.bankalar.IBankalarDAO;
import com.bitirime2020.databasemanagement.entities.Bankalar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BankalarService implements IBankalarService {

    private IBankalarDAO iBankalarDAO;

    @Autowired
    public BankalarService(IBankalarDAO iBankalarDAO) {
        this.iBankalarDAO = iBankalarDAO;
    }

    @Override
    @Transactional
    public List<Bankalar> getAll() {
        return this.iBankalarDAO.getAll();
    }

    @Override
    @Transactional
    public void add(Bankalar bankalar) {
        this.iBankalarDAO.add(bankalar);
    }

    @Override
    @Transactional
    public void update(Bankalar bankalar) {
        this.iBankalarDAO.update(bankalar);
    }

    @Override
    @Transactional
    public void delete(int id) {
        this.iBankalarDAO.delete(id);
    }

    @Override
    @Transactional
    public Bankalar getById(int id) {
        return this.iBankalarDAO.getById(id);
    }
}
