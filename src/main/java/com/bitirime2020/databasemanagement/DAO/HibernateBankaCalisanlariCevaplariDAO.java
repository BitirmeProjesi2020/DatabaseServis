package com.bitirime2020.databasemanagement.DAO;

import com.bitirime2020.databasemanagement.Entities.BankaCalisanlariCevaplari;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class HibernateBankaCalisanlariCevaplariDAO implements IBankaCalisanlariCevaplariDAO {

    private EntityManager entityManager;

    @Autowired
    public HibernateBankaCalisanlariCevaplariDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<BankaCalisanlariCevaplari> getAll() {
        Session session = entityManager.unwrap(Session.class);
        return session.createQuery("from BankaCalisanlariCevaplari", BankaCalisanlariCevaplari.class).getResultList();
    }

    @Override
    @Transactional
    public void add(BankaCalisanlariCevaplari bankaCalisanlariCevaplari) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(bankaCalisanlariCevaplari);
    }

    @Override
    @Transactional
    public void update(BankaCalisanlariCevaplari bankaCalisanlariCevaplari) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(bankaCalisanlariCevaplari);
    }

    @Override
    @Transactional
    public void delete(int id) {
        Session session = entityManager.unwrap(Session.class);
        BankaCalisanlariCevaplari bankaCalisanlariCevaplari = session.get(BankaCalisanlariCevaplari.class, id);
        session.delete(bankaCalisanlariCevaplari);
    }

    @Override
    @Transactional
    public BankaCalisanlariCevaplari getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(BankaCalisanlariCevaplari.class, id);
    }
}
