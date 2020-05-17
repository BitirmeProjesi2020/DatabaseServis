package com.bitirime2020.databasemanagement.DAO;

import com.bitirime2020.databasemanagement.Entities.Kullanicilar;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class HibernateKullanicilarDAO implements IKullanicilarDAO {

    private EntityManager entityManager;

    @Autowired
    public HibernateKullanicilarDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Kullanicilar> getAll() {
        Session session = entityManager.unwrap(Session.class);
        return session.createQuery("from Kullanicilar", Kullanicilar.class).getResultList();
    }

    @Override
    @Transactional
    public void add(Kullanicilar kullanicilar) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(kullanicilar);
    }

    @Override
    @Transactional
    public void update(Kullanicilar kullanicilar) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(kullanicilar);
    }

    @Override
    @Transactional
    public void delete(int id) {
        Session session = entityManager.unwrap(Session.class);
        Kullanicilar kullanicilar = session.get(Kullanicilar.class, id);
        session.delete(kullanicilar);
    }

    @Override
    @Transactional
    public Kullanicilar getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(Kullanicilar.class, id);
    }
}
