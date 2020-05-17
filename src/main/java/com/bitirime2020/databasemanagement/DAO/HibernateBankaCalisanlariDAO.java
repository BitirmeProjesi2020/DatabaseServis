package com.bitirime2020.databasemanagement.DAO;

import com.bitirime2020.databasemanagement.Entities.BankaCalisanlari;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class HibernateBankaCalisanlariDAO implements IBankaCalisanlariDAO {

    private EntityManager entityManager;

    @Autowired
    public HibernateBankaCalisanlariDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<BankaCalisanlari> getAll() {
        Session session = entityManager.unwrap(Session.class);
        return session.createQuery("from BankaCalisanlari", BankaCalisanlari.class).getResultList();
    }

    @Override
    @Transactional
    public void add(BankaCalisanlari bankaCalisanlari) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(bankaCalisanlari);
    }

    @Override
    @Transactional
    public void update(BankaCalisanlari bankaCalisanlari) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(bankaCalisanlari);
    }

    @Override
    @Transactional
    public void delete(int id) {
        Session session = entityManager.unwrap(Session.class);
        BankaCalisanlari bankaCalisanlari = session.get(BankaCalisanlari.class, id);
        session.delete(bankaCalisanlari);
    }

    @Override
    @Transactional
    public BankaCalisanlari getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(BankaCalisanlari.class, id);
    }
}
