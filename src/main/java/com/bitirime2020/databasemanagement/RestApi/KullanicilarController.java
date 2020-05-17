package com.bitirime2020.databasemanagement.RestApi;

import com.bitirime2020.databasemanagement.Business.IKullanicilarService;
import com.bitirime2020.databasemanagement.Entities.Kullanicilar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class KullanicilarController {
    private IKullanicilarService iKullanicilarService;

    @Autowired
    public KullanicilarController(IKullanicilarService iKullanicilarService) {
        this.iKullanicilarService = iKullanicilarService;
    }

    @GetMapping("/kullanicilar/getAll")
    public List<Kullanicilar> getAll() {
        return iKullanicilarService.getAll();
    }

    @PostMapping("/kullanicilar/add")
    public void add(@RequestBody Kullanicilar kullanicilar) {
        iKullanicilarService.add(kullanicilar);
    }

    @PostMapping("/kullanicilar/update")
    public void update(@RequestBody Kullanicilar kullanicilar) {
        iKullanicilarService.update(kullanicilar);
    }

    @PostMapping("/kullanicilar/delete")
    public void delete(@RequestBody int id) {
        iKullanicilarService.delete(id);
    }

    @GetMapping("/kullanicilar/getById")
    public Kullanicilar getById(int id) {
        return iKullanicilarService.getById(id);
    }
}
