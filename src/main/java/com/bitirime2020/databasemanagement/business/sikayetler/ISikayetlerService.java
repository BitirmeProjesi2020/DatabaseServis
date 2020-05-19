package com.bitirime2020.databasemanagement.business.sikayetler;

import com.bitirime2020.databasemanagement.entities.Sikayetler;

import java.util.List;

public interface ISikayetlerService {
    List<Sikayetler> getAll();
    void add(Sikayetler sikayetler);
    void update(Sikayetler sikayetler);
    void delete(int id);
    Sikayetler getById(int id);
}
