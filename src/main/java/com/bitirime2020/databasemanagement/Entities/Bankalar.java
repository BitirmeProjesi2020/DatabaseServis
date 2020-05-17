package com.bitirime2020.databasemanagement.Entities;

import javax.persistence.*;

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

    public Bankalar(String ad, int mevcutSikayet, int cozulenSikayet) {
        this.ad = ad;
        this.mevcutSikayet = mevcutSikayet;
        this.cozulenSikayet = cozulenSikayet;
    }

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
}
