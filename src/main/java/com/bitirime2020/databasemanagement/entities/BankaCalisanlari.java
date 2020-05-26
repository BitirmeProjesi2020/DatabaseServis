package com.bitirime2020.databasemanagement.entities;

import javax.persistence.*;

@Entity
@Table(name = "banka_calisanlari")
public class BankaCalisanlari {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "ad_soyad")
    private String adSoyad;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "calistigi_banka")
    private Bankalar calistigiBanka;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "calistigi_departman")
    private BankaKategorileri calistigiDepartman;


    public BankaCalisanlari() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String  getCalistigiBanka() {
        return calistigiBanka.getAd();
    }

    public void setCalistigiBanka(Bankalar calistigiBanka) {
        this.calistigiBanka = calistigiBanka;
    }

    public String  getCalistigiDepartman() {
        return calistigiDepartman.getKategoriAdi();
    }

    public void setCalistigiDepartman(BankaKategorileri calistigiDepartman) {
        this.calistigiDepartman = calistigiDepartman;
    }
}
