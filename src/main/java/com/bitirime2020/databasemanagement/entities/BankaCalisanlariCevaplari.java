package com.bitirime2020.databasemanagement.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "banka_calisanlari_cevaplari")
public class BankaCalisanlariCevaplari {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "banka_calisanlariid")
    private BankaCalisanlari bankaCalisanlariId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "sikayetlerid")
    private Sikayetler sikayetlerId;

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

    public String  getBankaCalisanlariId() {
        return bankaCalisanlariId.getAdSoyad();
    }

    public void setBankaCalisanlariId(BankaCalisanlari bankaCalisanlariId) {
        this.bankaCalisanlariId = bankaCalisanlariId;
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
