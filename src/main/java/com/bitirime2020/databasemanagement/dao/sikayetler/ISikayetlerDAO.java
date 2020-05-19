package com.bitirime2020.databasemanagement.dao.sikayetler;

import com.bitirime2020.databasemanagement.entities.Sikayetler;

import java.util.List;

public interface ISikayetlerDAO {
    List<Sikayetler> getAll();
    void add(Sikayetler sikayetler);
    void update(Sikayetler sikayetler);
    void delete(int id);
    Sikayetler getById(int id);
}
