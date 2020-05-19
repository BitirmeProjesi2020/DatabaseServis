package com.bitirime2020.databasemanagement.dao.kullanicicevaplari;

import com.bitirime2020.databasemanagement.entities.KullaniciCevaplari;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class HibernateKullaniciCevaplariDAO implements IKullaniciCevaplariDAO {

    private EntityManager entityManager;

    @Autowired
    public HibernateKullaniciCevaplariDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<KullaniciCevaplari> getAll() {
        Session session = entityManager.unwrap(Session.class);
        return session.createQuery("from KullaniciCevaplari", KullaniciCevaplari.class).getResultList();
    }

    @Override
    @Transactional
    public void add(KullaniciCevaplari kullaniciCevaplari) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(kullaniciCevaplari);
    }

    @Override
    @Transactional
    public void update(KullaniciCevaplari kullaniciCevaplari) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(kullaniciCevaplari);
    }

    @Override
    @Transactional
    public void delete(int id) {
        Session session = entityManager.unwrap(Session.class);
        KullaniciCevaplari kullaniciCevaplari = session.get(KullaniciCevaplari.class, id);
        session.delete(kullaniciCevaplari);
    }

    @Override
    @Transactional
    public KullaniciCevaplari getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(KullaniciCevaplari.class, id);
    }
}
