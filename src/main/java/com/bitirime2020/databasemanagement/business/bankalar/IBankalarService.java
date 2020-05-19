package com.bitirime2020.databasemanagement.business.bankalar;

import com.bitirime2020.databasemanagement.entities.Bankalar;

import java.util.List;

public interface IBankalarService {
    List<Bankalar> getAll();
    void add(Bankalar bankalar);
    void update(Bankalar bankalar);
    void delete(int id);
    Bankalar getById(int id);
}
