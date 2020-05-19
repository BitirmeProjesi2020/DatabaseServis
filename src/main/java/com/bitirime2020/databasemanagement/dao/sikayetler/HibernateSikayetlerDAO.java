package com.bitirime2020.databasemanagement.dao.sikayetler;

import com.bitirime2020.databasemanagement.entities.Sikayetler;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class HibernateSikayetlerDAO implements ISikayetlerDAO{

    private EntityManager entityManager;

    @Autowired
    public HibernateSikayetlerDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Sikayetler> getAll() {
        Session session = entityManager.unwrap(Session.class);
        return session.createQuery("from Sikayetler", Sikayetler.class).getResultList();
    }

    @Override
    @Transactional
    public void add(Sikayetler sikayetler) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(sikayetler);
    }

    @Override
    @Transactional
    public void update(Sikayetler sikayetler) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(sikayetler);
    }

    @Override
    @Transactional
    public void delete(int id) {
        Session session = entityManager.unwrap(Session.class);
        Sikayetler sikayetler = session.get(Sikayetler.class, id);
        session.delete(sikayetler);
    }

    @Override
    @Transactional
    public Sikayetler getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(Sikayetler.class, id);    }
}
