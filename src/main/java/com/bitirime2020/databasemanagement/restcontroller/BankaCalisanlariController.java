package com.bitirime2020.databasemanagement.restcontroller;

import com.bitirime2020.databasemanagement.business.bankacalisanlari.IBankaCalisanlariService;
import com.bitirime2020.databasemanagement.entities.BankaCalisanlari;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bankaCalisanlari")
public class BankaCalisanlariController {
    private IBankaCalisanlariService iBankaCalisanlariService;

    @Autowired
    public BankaCalisanlariController(IBankaCalisanlariService iBankaCalisanlariService) {
        this.iBankaCalisanlariService = iBankaCalisanlariService;
    }

    @GetMapping("/getAll")
    public List<BankaCalisanlari> getAll() {
        return iBankaCalisanlariService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody BankaCalisanlari bankaCalisanlari) {
        iBankaCalisanlariService.add(bankaCalisanlari);
    }

    @PostMapping("/update")
    public void update(@RequestBody BankaCalisanlari bankaCalisanlari) {
        iBankaCalisanlariService.update(bankaCalisanlari);
    }

    @GetMapping("/delete")
    public void delete(int id) {
        iBankaCalisanlariService.delete(id);
    }

    @GetMapping("/getById")
    public BankaCalisanlari getById(int id) {
        return iBankaCalisanlariService.getById(id);
    }
}
