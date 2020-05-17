package com.bitirime2020.databasemanagement.Business;

import com.bitirime2020.databasemanagement.Entities.Kullanicilar;

import java.util.List;

public interface IKullanicilarService {
    List<Kullanicilar> getAll();
    void add(Kullanicilar kullanicilar);
    void update(Kullanicilar kullanicilar);
    void delete(int id);
    Kullanicilar getById(int id);
}
