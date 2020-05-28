package com.bitirime2020.databasemanagement.business.bankacalisanlaricevaplari;

import com.bitirime2020.databasemanagement.entities.BankaCalisanlariCevaplari;

import java.util.List;

public interface IBankaCalisanlariCevaplariService {
    List<BankaCalisanlariCevaplari> getAll();
    void add(BankaCalisanlariCevaplari bankaCalisanlariCevaplari);
    void update(BankaCalisanlariCevaplari bankaCalisanlariCevaplari);
    void delete(int id);
    BankaCalisanlariCevaplari getById(int id);
    List<BankaCalisanlariCevaplari> getRecentSikayet(int sikayetid);
}
