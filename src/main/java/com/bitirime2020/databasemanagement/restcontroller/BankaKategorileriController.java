package com.bitirime2020.databasemanagement.restcontroller;

import com.bitirime2020.databasemanagement.business.bankakategorileri.IBankaKategorileriService;
import com.bitirime2020.databasemanagement.entities.BankaKategorileri;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bankaKategorileri")
public class BankaKategorileriController {
    private IBankaKategorileriService iBankaKategorileriService;

    @Autowired
    public BankaKategorileriController(IBankaKategorileriService iBankaKategorileriService) {
        this.iBankaKategorileriService = iBankaKategorileriService;
    }

    @GetMapping("/getAll")
    public List<BankaKategorileri> getAll() {
        return iBankaKategorileriService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody BankaKategorileri bankaKategorileri) {
        iBankaKategorileriService.add(bankaKategorileri);
    }

    @PostMapping("/update")
    public void update(@RequestBody BankaKategorileri bankaKategorileri) {
        iBankaKategorileriService.update(bankaKategorileri);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody int id) {
        iBankaKategorileriService.delete(id);
    }

    @GetMapping("/getById")
    public BankaKategorileri getById(int id) {
        return iBankaKategorileriService.getById(id);
    }
}
