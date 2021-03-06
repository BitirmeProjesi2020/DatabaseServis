package com.bitirime2020.databasemanagement.dao.bankacalisanlaricevaplari;

import com.bitirime2020.databasemanagement.entities.BankaCalisanlariCevaplari;
import com.bitirime2020.databasemanagement.entities.KullaniciCevaplari;

import java.util.List;

public interface IBankaCalisanlariCevaplariDAO {
    List<BankaCalisanlariCevaplari> getAll();
    void add(BankaCalisanlariCevaplari bankaCalisanlariCevaplari);
    void update(BankaCalisanlariCevaplari bankaCalisanlariCevaplari);
    void delete(int id);
    BankaCalisanlariCevaplari getById(int id);
    List<BankaCalisanlariCevaplari> getRecentSikayet(int sikayetid);
}
