package com.bitirime2020.databasemanagement.entities;

import javax.persistence.*;
import java.time.*;

@Entity
@Table(name = "sikayetler")
public class Sikayetler {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "banka_id")
    private int bankaId;

    @Column(name = "sikayet_basligi")
    private String sikayetBasligi;

    @Column(name = "sikayet_telefon_no")
    private String sikayetTelefonNo;

    @Column(name = "sikayet_icerigi")
    private String sikayetIcerigi;

    @Column(name = "sikayet_kategorisi")
    private int sikayetKategorisi;

    @Column(name = "sikayet_tarihi")
    private LocalDateTime sikayetTarihi;

    @Column(name = "is_solved")
    private Boolean isSolved;

    @Column(name = "is_show_name")
    private Boolean isShowName;

    @Column(name = "sikayeti_yapan_kisi")
    private int kullanici;

    public Sikayetler() {
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

    public int getSikayetKategorisi() {
        return sikayetKategorisi;
    }

    public void setSikayetKategorisi(int sikayetKategorisi) {
        this.sikayetKategorisi = sikayetKategorisi;
    }

    public Long getSikayetTarihi() {
        ZonedDateTime zdt = ZonedDateTime.of(sikayetTarihi, ZoneId.of("Europe/Istanbul"));
        return zdt.toInstant().toEpochMilli();
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
