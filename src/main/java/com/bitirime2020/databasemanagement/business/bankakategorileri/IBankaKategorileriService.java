package com.bitirime2020.databasemanagement.business.bankakategorileri;

import com.bitirime2020.databasemanagement.entities.BankaKategorileri;

import java.util.List;

public interface IBankaKategorileriService {
    List<BankaKategorileri> getAll();
    void add(BankaKategorileri bankaKategorileri);
    void update(BankaKategorileri bankaKategorileri);
    void delete(int id);
    BankaKategorileri getById(int id);
}
