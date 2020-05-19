package com.bitirime2020.databasemanagement.restcontroller;

import com.bitirime2020.databasemanagement.business.bankalar.IBankalarService;
import com.bitirime2020.databasemanagement.entities.Bankalar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bankalar")
public class BankalarController {
    private IBankalarService iBankalarService;

    @Autowired
    public BankalarController(IBankalarService iBankalarService) {
        this.iBankalarService = iBankalarService;
    }

    @GetMapping("/getAll")
    public List<Bankalar> getAll() {
        return iBankalarService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody Bankalar bankalar) {
        iBankalarService.add(bankalar);
    }

    @PostMapping("/update")
    public void update(@RequestBody Bankalar bankalar) {
        iBankalarService.update(bankalar);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody int id) {
        iBankalarService.delete(id);
    }

    @GetMapping("/getById")
    public Bankalar getById(int id) {
        return iBankalarService.getById(id);
    }
}
