package com.bitirime2020.databasemanagement.Entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "sikayetler")
public class Sikayetler {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "sikayeti_yapan_kisi")
    private int sikayetiYapanKisi;

    @Column(name = "banka_id")
    private int bankaId;

    @Column(name = "sikayet_basligi")
    private String sikayetBasligi;

    @Column(name = "sikayet_telefon_no")
    private String sikayetTelefonNo;

    @Column(name = "sikayet_icerigi")
    private String sikayetIcerigi;

    @Column(name = "sikayet_tarihi")
    private LocalDateTime sikayetTarihi;

    @Column(name = "is_solved")
    private Boolean isSolved;

    @Column(name = "is_show_name")
    private Boolean isShowName;

    public Sikayetler(int sikayetiYapanKisi, int bankaId, String sikayetBasligi, String sikayetTelefonNo, String sikayetIcerigi, LocalDateTime sikayetTarihi, Boolean isSolved, Boolean isShowName) {
        this.sikayetiYapanKisi = sikayetiYapanKisi;
        this.bankaId = bankaId;
        this.sikayetBasligi = sikayetBasligi;
        this.sikayetTelefonNo = sikayetTelefonNo;
        this.sikayetIcerigi = sikayetIcerigi;
        this.sikayetTarihi = sikayetTarihi;
        this.isSolved = isSolved;
        this.isShowName = isShowName;
    }

    public Sikayetler() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSikayetiYapanKisi() {
        return sikayetiYapanKisi;
    }

    public void setSikayetiYapanKisi(int sikayetiYapanKisi) {
        this.sikayetiYapanKisi = sikayetiYapanKisi;
    }

    public int getBankaId() {
        return bankaId;
    }

    public void setBankaId(int bankaId) {
        this.bankaId = bankaId;
    }

    public String getSikayetBasligi() {
        return sikayetBasligi;
    }

    public void setSikayetBasligi(String sikayetBasligi) {
        this.sikayetBasligi = sikayetBasligi;
    }

    public String getSikayetTelefonNo() {
        return sikayetTelefonNo;
    }

    public void setSikayetTelefonNo(String sikayetTelefonNo) {
        this.sikayetTelefonNo = sikayetTelefonNo;
    }

    public String getSikayetIcerigi() {
        return sikayetIcerigi;
    }

    public void setSikayetIcerigi(String sikayetIcerigi) {
        this.sikayetIcerigi = sikayetIcerigi;
    }

    public LocalDateTime getSikayetTarihi() {
        return sikayetTarihi;
    }

    public void setSikayetTarihi(LocalDateTime sikayetTarihi) {
        this.sikayetTarihi = sikayetTarihi;
    }

    public Boolean getSolved() {
        return isSolved;
    }

    public void setSolved(Boolean solved) {
        isSolved = solved;
    }

    public Boolean getShowName() {
        return isShowName;
    }

    public void setShowName(Boolean showName) {
        isShowName = showName;
    }
}
