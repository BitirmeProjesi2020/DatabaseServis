package com.bitirime2020.databasemanagement.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "banka_kategorileri")
public class BankaKategorileri {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "kategori_adi")
    private String kategoriAdi;

    @OneToMany(mappedBy = "sikayetKategorisi", fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    private List<Sikayetler> sikayetlerList;

    @OneToMany(mappedBy = "calistigiDepartman", fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    private List<BankaCalisanlari> bankaCalisanlariList;

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

    public void setSikayetlerList(List<Sikayetler> sikayetlerList) {
        this.sikayetlerList = sikayetlerList;
    }

    public void setBankaCalisanlariList(List<BankaCalisanlari> bankaCalisanlariList) {
        this.bankaCalisanlariList = bankaCalisanlariList;
    }
}
