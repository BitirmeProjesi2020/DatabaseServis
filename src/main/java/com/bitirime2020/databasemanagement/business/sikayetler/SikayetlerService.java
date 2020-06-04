package com.bitirime2020.databasemanagement.business.sikayetler;

import com.bitirime2020.databasemanagement.entities.Sikayetler;
import com.bitirime2020.databasemanagement.dao.sikayetler.ISikayetlerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

@Service
public class SikayetlerService implements ISikayetlerService {

    private ISikayetlerDAO iSikayetlerDAO;

    @Autowired
    public SikayetlerService(ISikayetlerDAO iSikayetlerDAO) {
        this.iSikayetlerDAO = iSikayetlerDAO;
    }

    @Override
    @Transactional
    public List<Sikayetler> getAll() {
        return this.iSikayetlerDAO.getAll();
    }

    @Override
    @Transactional
    public void add(Sikayetler sikayetler) {
        sikayetler.setSikayetTarihi(LocalDateTime.now());
        this.iSikayetlerDAO.add(sikayetler);
    }

    @Override
    @Transactional
    public void update(Sikayetler sikayetler) {
        LocalDateTime date = LocalDateTime.ofInstant(Instant.ofEpochMilli(iSikayetlerDAO.getById(sikayetler.getId()).getSikayetTarihi()), ZoneId.systemDefault());
        sikayetler.setSikayetTarihi(date);
        this.iSikayetlerDAO.update(sikayetler);
    }

    @Override
    @Transactional
    public void delete(int id) {
        this.iSikayetlerDAO.delete(id);
    }

    @Override
    @Transactional
    public Sikayetler getById(int id) {
        return this.iSikayetlerDAO.getById(id);
    }
}
