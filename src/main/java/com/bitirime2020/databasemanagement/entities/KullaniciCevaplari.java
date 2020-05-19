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

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "kullanicilarid")
    private Kullanicilar kullanici;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "sikayetlerid")
    private Sikayetler sikayetlerId;

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

    public String getKullanici() {
        return kullanici.getAdSoyad();
    }

    public void setKullanici(Kullanicilar kullanici) {
        this.kullanici = kullanici;
    }

    public int getSikayetlerId() {
        return sikayetlerId.getId();
    }

    public void setSikayetlerId(Sikayetler sikayetlerId) {
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
