package com.bitirime2020.databasemanagement.dao.bankalar;

import com.bitirime2020.databasemanagement.entities.Bankalar;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class HibernateBankalarDAO implements IBankalarDAO {

    private EntityManager entityManager;

    @Autowired
    public HibernateBankalarDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Bankalar> getAll() {
        Session session = entityManager.unwrap(Session.class);
        return session.createQuery("from Bankalar", Bankalar.class).getResultList();
    }

    @Override
    @Transactional
    public void add(Bankalar bankalar) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(bankalar);
    }

    @Override
    @Transactional
    public void update(Bankalar bankalar) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(bankalar);
    }

    @Override
    @Transactional
    public void delete(int id) {
        Session session = entityManager.unwrap(Session.class);
        Bankalar bankalar = session.get(Bankalar.class, id);
        session.delete(bankalar);
    }

    @Override
    @Transactional
    public Bankalar getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(Bankalar.class, id);
    }
}
