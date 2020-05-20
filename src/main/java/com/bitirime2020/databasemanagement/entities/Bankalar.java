package com.bitirime2020.databasemanagement.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "bankalar")
public class Bankalar {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "ad")
    private String ad;

    @Column(name = "mevcut_sikayet")
    private int mevcutSikayet;

    @Column(name = "cozulenSikayet")
    private int cozulenSikayet;

    @OneToMany(mappedBy = "calistigiDepartman", fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    private List<BankaCalisanlari> bankaCalisanlariList;

    @OneToMany(mappedBy = "bankaId", fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    private List<Sikayetler> sikayetlerList;

    public Bankalar() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getMevcutSikayet() {
        return mevcutSikayet;
    }

    public void setMevcutSikayet(int mevcutSikayet) {
        this.mevcutSikayet = mevcutSikayet;
    }

    public int getCozulenSikayet() {
        return cozulenSikayet;
    }

    public void setCozulenSikayet(int cozulenSikayet) {
        this.cozulenSikayet = cozulenSikayet;
    }

    public List<BankaCalisanlari> getBankaCalisanlariList() {
        return bankaCalisanlariList;
    }

    public void setBankaCalisanlariList(List<BankaCalisanlari> bankaCalisanlariList) {
        this.bankaCalisanlariList = bankaCalisanlariList;
    }

    public List<Sikayetler> getSikayetlerList() {
        return sikayetlerList;
    }

    public void setSikayetlerList(List<Sikayetler> sikayetlerList) {
        this.sikayetlerList = sikayetlerList;
    }
}
