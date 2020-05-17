package com.bitirime2020.databasemanagement.DAO;

import com.bitirime2020.databasemanagement.Entities.BankaCalisanlariCevaplari;

import java.util.List;

public interface IBankaCalisanlariCevaplariDAO {
    List<BankaCalisanlariCevaplari> getAll();
    void add(BankaCalisanlariCevaplari bankaCalisanlariCevaplari);
    void update(BankaCalisanlariCevaplari bankaCalisanlariCevaplari);
    void delete(int id);
    BankaCalisanlariCevaplari getById(int id);
}
