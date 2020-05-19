package com.bitirime2020.databasemanagement.dao.bankakategorileri;

import com.bitirime2020.databasemanagement.entities.BankaKategorileri;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class HibernateBankaKategorileriDAO implements IBankaKategorileriDAO {

    private EntityManager entityManager;

    @Autowired
    public HibernateBankaKategorileriDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<BankaKategorileri> getAll() {
        Session session = entityManager.unwrap(Session.class);
        return session.createQuery("from BankaKategorileri", BankaKategorileri.class).getResultList();
    }

    @Override
    @Transactional
    public void add(BankaKategorileri bankaKategorileri) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(bankaKategorileri);
    }

    @Override
    @Transactional
    public void update(BankaKategorileri bankaKategorileri) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(bankaKategorileri);
    }

    @Override
    @Transactional
    public void delete(int id) {
        Session session = entityManager.unwrap(Session.class);
        BankaKategorileri bankaKategorileri = session.get(BankaKategorileri.class, id);
        session.delete(bankaKategorileri);
    }

    @Override
    @Transactional
    public BankaKategorileri getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(BankaKategorileri.class, id);
    }
}
