package com.bitirime2020.databasemanagement.Entities;

import javax.persistence.*;

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

    public Kullanicilar(int id, String adSoyad, String email, String password) {
        this.id = id;
        this.adSoyad = adSoyad;
        this.email = email;
        this.password = password;
    }

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
}
