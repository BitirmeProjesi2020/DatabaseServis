package com.bitirime2020.databasemanagement.business.bankacalisanlari;

import com.bitirime2020.databasemanagement.entities.BankaCalisanlari;

import java.util.List;

public interface IBankaCalisanlariService {
    List<BankaCalisanlari> getAll();
    void add(BankaCalisanlari bankaCalisanlari);
    void update(BankaCalisanlari bankaCalisanlari);
    void delete(int id);
    BankaCalisanlari getById(int id);
}
