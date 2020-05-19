package com.bitirime2020.databasemanagement.dao.bankalar;

import com.bitirime2020.databasemanagement.entities.Bankalar;

import java.util.List;

public interface IBankalarDAO {
    List<Bankalar> getAll();
    void add(Bankalar bankalar);
    void update(Bankalar bankalar);
    void delete(int id);
    Bankalar getById(int id);
}
