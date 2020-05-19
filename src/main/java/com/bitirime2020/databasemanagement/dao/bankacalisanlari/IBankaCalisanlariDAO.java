package com.bitirime2020.databasemanagement.dao.bankacalisanlari;

import com.bitirime2020.databasemanagement.entities.BankaCalisanlari;

import java.util.List;

public interface IBankaCalisanlariDAO {
    List<BankaCalisanlari> getAll();
    void add(BankaCalisanlari bankaCalisanlari);
    void update(BankaCalisanlari bankaCalisanlari);
    void delete(int id);
    BankaCalisanlari getById(int id);
}
