package com.bitirime2020.databasemanagement.restcontroller;

import com.bitirime2020.databasemanagement.business.bankacalisanlaricevaplari.IBankaCalisanlariCevaplariService;
import com.bitirime2020.databasemanagement.entities.BankaCalisanlariCevaplari;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bankaCalisanlariCevaplari")
public class BankaCalisanlariCevaplariController {
    private IBankaCalisanlariCevaplariService iBankaCalisanlariCevaplariService;

    @Autowired
    public BankaCalisanlariCevaplariController(IBankaCalisanlariCevaplariService iBankaCalisanlariCevaplariService) {
        this.iBankaCalisanlariCevaplariService = iBankaCalisanlariCevaplariService;
    }

    @GetMapping("/getAll")
    public List<BankaCalisanlariCevaplari> getAll() {
        return iBankaCalisanlariCevaplariService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody BankaCalisanlariCevaplari bankaCalisanlariCevaplari) {
        iBankaCalisanlariCevaplariService.add(bankaCalisanlariCevaplari);
    }

    @PostMapping("/update")
    public void update(@RequestBody BankaCalisanlariCevaplari bankaCalisanlariCevaplari) {
        iBankaCalisanlariCevaplariService.update(bankaCalisanlariCevaplari);
    }

    @GetMapping("/delete")
    public void delete(int id) {
        iBankaCalisanlariCevaplariService.delete(id);
    }

    @GetMapping("/getById")
    public BankaCalisanlariCevaplari getById(int id) {
        return iBankaCalisanlariCevaplariService.getById(id);
    }

    @GetMapping("/getRecentSikayet")
    public List<BankaCalisanlariCevaplari> getRecentSikayet(int sikayetid) {
        return iBankaCalisanlariCevaplariService.getRecentSikayet(sikayetid);
    }
}
