package com.bitirime2020.databasemanagement.Business;

import com.bitirime2020.databasemanagement.Entities.BankaCalisanlariCevaplari;

import java.util.List;

public interface IBankaCalisanlariCevaplariService {
    List<BankaCalisanlariCevaplari> getAll();
    void add(BankaCalisanlariCevaplari bankaCalisanlariCevaplari);
    void update(BankaCalisanlariCevaplari bankaCalisanlariCevaplari);
    void delete(int id);
    BankaCalisanlariCevaplari getById(int id);
}
