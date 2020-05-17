package com.bitirime2020.databasemanagement.Business;

import com.bitirime2020.databasemanagement.Entities.BankaCalisanlari;

import java.util.List;

public interface IBankaCalisanlariService {
    List<BankaCalisanlari> getAll();
    void add(BankaCalisanlari bankaCalisanlari);
    void update(BankaCalisanlari bankaCalisanlari);
    void delete(int id);
    BankaCalisanlari getById(int id);
}
