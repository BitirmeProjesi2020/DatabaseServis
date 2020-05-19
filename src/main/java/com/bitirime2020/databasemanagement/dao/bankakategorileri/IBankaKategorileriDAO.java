package com.bitirime2020.databasemanagement.dao.bankakategorileri;

import com.bitirime2020.databasemanagement.entities.BankaKategorileri;

import java.util.List;

public interface IBankaKategorileriDAO {
    List<BankaKategorileri> getAll();
    void add(BankaKategorileri bankaKategorileri);
    void update(BankaKategorileri bankaKategorileri);
    void delete(int id);
    BankaKategorileri getById(int id);
}
