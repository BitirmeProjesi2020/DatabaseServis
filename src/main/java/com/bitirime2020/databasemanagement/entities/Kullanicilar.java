package com.bitirime2020.databasemanagement.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "kullanicilar")
public class Kullanicilar {

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

    @OneToMany(mappedBy = "kullanici", fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    private List<Sikayetler> sikayetlerList;

    @OneToMany(mappedBy = "kullanici", fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    private List<KullaniciCevaplari> KullaniciCevaplariList;

    public Kullanicilar() {
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

    public List<Sikayetler> getSikayetlerList() {
        return sikayetlerList;
    }

    public List<KullaniciCevaplari> getKullaniciCevaplariList() {
        return KullaniciCevaplariList;
    }

    public void setKullaniciCevaplariList(List<KullaniciCevaplari> kullaniciCevaplariList) {
        KullaniciCevaplariList = kullaniciCevaplariList;
    }
}
