package com.bitirime2020.databasemanagement.restcontroller;

import com.bitirime2020.databasemanagement.entities.KullaniciCevaplari;
import com.bitirime2020.databasemanagement.business.kullanicicevaplari.IKullaniciCevaplariService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kullanicilarCevaplari")
public class KullaniciCevaplariController {
    private IKullaniciCevaplariService iKullaniciCevaplariService;

    @Autowired
    public KullaniciCevaplariController(IKullaniciCevaplariService iKullaniciCevaplariService) {
        this.iKullaniciCevaplariService = iKullaniciCevaplariService;
    }

    @GetMapping("/getAll")
    public List<KullaniciCevaplari> getAll() {
        return iKullaniciCevaplariService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody KullaniciCevaplari kullaniciCevaplari) {
        iKullaniciCevaplariService.add(kullaniciCevaplari);
    }

    @PostMapping("/update")
    public void update(@RequestBody KullaniciCevaplari kullaniciCevaplari) {
        iKullaniciCevaplariService.update(kullaniciCevaplari);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody int id) {
        iKullaniciCevaplariService.delete(id);
    }

    @GetMapping("/getById")
    public KullaniciCevaplari getById(int id) {
        return iKullaniciCevaplariService.getById(id);
    }

    @GetMapping("/getRecentSikayet")
    public List<KullaniciCevaplari> getRecentSikayet(int sikayetid) {
        return iKullaniciCevaplariService.getRecentSikayet(sikayetid);
    }
}
