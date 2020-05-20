package com.bitirime2020.databasemanagement.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "sikayetler")
public class Sikayetler {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "banka_id")
    private Bankalar bankaId;

    @Column(name = "sikayet_basligi")
    private String sikayetBasligi;

    @Column(name = "sikayet_telefon_no")
    private String sikayetTelefonNo;

    @Column(name = "sikayet_icerigi")
    private String sikayetIcerigi;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "sikayet_kategorisi")
    private BankaKategorileri sikayetKategorisi;

    @Column(name = "sikayet_tarihi")
    private LocalDateTime sikayetTarihi;

    @Column(name = "is_solved")
    private Boolean isSolved;

    @Column(name = "is_show_name")
    private Boolean isShowName;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "sikayeti_yapan_kisi")
    private Kullanicilar kullanici;

    @OneToMany(mappedBy = "kullanici", fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    private List<KullaniciCevaplari> kullaniciCevaplariList;

    @OneToMany(mappedBy = "sikayetlerId", fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    private List<BankaCalisanlariCevaplari> bankaCalisanlariCevaplariList;

    public Sikayetler() {
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

    public void setKullanici(Kullanicilar kullanicilar) {
        this.kullanici = kullanicilar;
    }

    public String getBankaId() {
        return bankaId.getAd();
    }

    public void setBankaId(Bankalar bankaId) {
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

    public String getSikayetKategorisi() {
        return sikayetKategorisi.getKategoriAdi();
    }

    public void setSikayetKategorisi(BankaKategorileri sikayetKategorisi) {
        this.sikayetKategorisi = sikayetKategorisi;
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

    public List<KullaniciCevaplari> getKullaniciCevaplariList() {
        return kullaniciCevaplariList;
    }

    public void setKullaniciCevaplariList(List<KullaniciCevaplari> kullaniciCevaplariList) {
        this.kullaniciCevaplariList = kullaniciCevaplariList;
    }

    public List<BankaCalisanlariCevaplari> getBankaCalisanlariCevaplariList() {
        return bankaCalisanlariCevaplariList;
    }

    public void setBankaCalisanlariCevaplariList(List<BankaCalisanlariCevaplari> bankaCalisanlariCevaplariList) {
        this.bankaCalisanlariCevaplariList = bankaCalisanlariCevaplariList;
    }
}
