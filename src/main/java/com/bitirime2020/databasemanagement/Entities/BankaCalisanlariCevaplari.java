package com.bitirime2020.databasemanagement.Entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "banka_calisanlari_cevaplari")
public class BankaCalisanlariCevaplari {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "banka_calisanlariid")
    private String bankaCalisanlariId;

    @Column(name = "sikayetlerid")
    private int sikayetlerId;

    @Column(name = "mesaj")
    private String mesaj;

    @Column(name = "cevap_tarihi")
    private LocalDateTime cevapTarihi;

    public BankaCalisanlariCevaplari(String bankaCalisanlariId, int sikayetlerId, String mesaj, LocalDateTime cevapTarihi) {
        this.bankaCalisanlariId = bankaCalisanlariId;
        this.sikayetlerId = sikayetlerId;
        this.mesaj = mesaj;
        this.cevapTarihi = cevapTarihi;
    }

    public BankaCalisanlariCevaplari() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBankaCalisanlariId() {
        return bankaCalisanlariId;
    }

    public void setBankaCalisanlariId(String bankaCalisanlariId) {
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

    public LocalDateTime getCevapTarihi() {
        return cevapTarihi;
    }

    public void setCevapTarihi(LocalDateTime cevapTarihi) {
        this.cevapTarihi = cevapTarihi;
    }
}
