package com.bitirime2020.databasemanagement.restcontroller;

import com.bitirime2020.databasemanagement.business.kullanicilar.IKullanicilarService;
import com.bitirime2020.databasemanagement.entities.Kullanicilar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kullanicilar")
public class KullanicilarController {
    private IKullanicilarService iKullanicilarService;

    @Autowired
    public KullanicilarController(IKullanicilarService iKullanicilarService) {
        this.iKullanicilarService = iKullanicilarService;
    }

    @GetMapping("/getAll")
    public List<Kullanicilar> getAll() {
        return iKullanicilarService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody Kullanicilar kullanicilar) {
        iKullanicilarService.add(kullanicilar);
    }

    @PostMapping("/update")
    public void update(@RequestBody Kullanicilar kullanicilar) {
        iKullanicilarService.update(kullanicilar);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody int id) {
        iKullanicilarService.delete(id);
    }

    @GetMapping("/getById")
    public Kullanicilar getById(int id) {
        return iKullanicilarService.getById(id);
    }
}
