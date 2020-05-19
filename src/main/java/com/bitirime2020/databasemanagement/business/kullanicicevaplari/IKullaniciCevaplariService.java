package com.bitirime2020.databasemanagement.business.kullanicicevaplari;

import com.bitirime2020.databasemanagement.entities.KullaniciCevaplari;

import java.util.List;

public interface IKullaniciCevaplariService {
    List<KullaniciCevaplari> getAll();
    void add(KullaniciCevaplari kullaniciCevaplari);
    void update(KullaniciCevaplari kullaniciCevaplari);
    void delete(int id);
    KullaniciCevaplari getById(int id);
}
