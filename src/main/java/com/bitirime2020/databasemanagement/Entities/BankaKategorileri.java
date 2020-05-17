package com.bitirime2020.databasemanagement.Entities;

import javax.persistence.*;

@Entity
@Table(name = "banka_kategorileri")
public class BankaKategorileri {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "kategori_adi")
    private String kategoriAdi;

    public BankaKategorileri(int id, String kategoriAdi) {
        this.id = id;
        this.kategoriAdi = kategoriAdi;
    }

    public BankaKategorileri() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKategoriAdi() {
        return kategoriAdi;
    }

    public void setKategoriAdi(String kategoriAdi) {
        this.kategoriAdi = kategoriAdi;
    }
}
