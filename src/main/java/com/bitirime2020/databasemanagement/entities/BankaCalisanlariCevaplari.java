package com.bitirime2020.databasemanagement.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@Entity
@Table(name = "banka_calisanlari_cevaplari")
public class BankaCalisanlariCevaplari {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "banka_calisanlariid")
    private int bankaCalisanlariId;

    @Column(name = "sikayetlerid")
    private int sikayetlerId;

    @Column(name = "mesaj")
    private String mesaj;

    @Column(name = "cevap_tarihi")
    private LocalDateTime cevapTarihi;

    public BankaCalisanlariCevaplari() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBankaCalisanlariId() {
        return bankaCalisanlariId;
    }

    public void setBankaCalisanlariId(int bankaCalisanlariId) {
        this.bankaCalisanlariId = bankaCalisanlariId;
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
