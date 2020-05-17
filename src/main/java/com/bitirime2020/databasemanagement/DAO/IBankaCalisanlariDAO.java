package com.bitirime2020.databasemanagement.DAO;

import com.bitirime2020.databasemanagement.Entities.BankaCalisanlari;

import java.util.List;

public interface IBankaCalisanlariDAO {
    List<BankaCalisanlari> getAll();
    void add(BankaCalisanlari bankaCalisanlari);
    void update(BankaCalisanlari bankaCalisanlari);
    void delete(int id);
    BankaCalisanlari getById(int id);
}
