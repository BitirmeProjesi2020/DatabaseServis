package com.bitirime2020.databasemanagement.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "kullanici_cevaplari")
public class KullaniciCevaplari {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "kullanicilarid")
    private int kullanicilarId;

    @Column(name = "sikayetlerid")
    private int sikayetlerId;

    @Column(name = "mesaj")
    private String mesaj;

    @Column(name = "cevap_tarihi")
    private LocalDateTime cevapTarihi;

    public KullaniciCevaplari(int kullanicilarId, int sikayetlerId, String mesaj, LocalDateTime cevapTarihi) {
        this.kullanicilarId = kullanicilarId;
        this.sikayetlerId = sikayetlerId;
        this.mesaj = mesaj;
        this.cevapTarihi = cevapTarihi;
    }

    public KullaniciCevaplari() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKullanicilarId() {
        return kullanicilarId;
    }

    public void setKullanicilarId(int kullanicilarId) {
        this.kullanicilarId = kullanicilarId;
    }

    public int getSikayetlerId() {
        return sikayetlerId;
    }

    public void setSikayetlerId(int sikayetlerId) {
        this.sikayetlerId = sikayetlerId;
    }

    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }

    public LocalDateTime getCevapTarihi() {
        return cevapTarihi;
    }

    public void setCevapTarihi(LocalDateTime cevapTarihi) {
        this.cevapTarihi = cevapTarihi;
    }
}
