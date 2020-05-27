package com.bitirime2020.databasemanagement.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@Entity
@Table(name = "kullanici_cevaplari")
public class KullaniciCevaplari {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "kullanicilarid")
    private int kullanici;

    @Column(name = "sikayetlerid")
    private int sikayetlerId;

    @Column(name = "mesaj")
    private String mesaj;

    @Column(name = "cevap_tarihi")
    private LocalDateTime cevapTarihi;

    public KullaniciCevaplari() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKullanici() {
        return kullanici;
    }

    public void setKullanici(int kullanici) {
        this.kullanici = kullanici;
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

    public Long getCevapTarihi() {
        ZonedDateTime zdt = ZonedDateTime.of(cevapTarihi, ZoneId.of("Europe/Istanbul"));
        return zdt.toInstant().toEpochMilli();
    }

    public void setCevapTarihi(LocalDateTime cevapTarihi) {
        this.cevapTarihi = cevapTarihi;
    }
}
