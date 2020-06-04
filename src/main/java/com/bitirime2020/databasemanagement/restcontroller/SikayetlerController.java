package com.bitirime2020.databasemanagement.restcontroller;

import com.bitirime2020.databasemanagement.entities.Sikayetler;
import com.bitirime2020.databasemanagement.business.sikayetler.ISikayetlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sikayetler")
public class SikayetlerController {
    private ISikayetlerService iSikayetlerService;

    @Autowired
    public SikayetlerController(ISikayetlerService iSikayetlerService) {
        this.iSikayetlerService = iSikayetlerService;
    }

    @GetMapping("/getAll")
    public List<Sikayetler> getAll() {
        return iSikayetlerService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody Sikayetler sikayetler) {
        iSikayetlerService.add(sikayetler);
    }

    @PostMapping("/update")
    public void update(@RequestBody Sikayetler sikayetler) {
        iSikayetlerService.update(sikayetler);
    }

    @GetMapping("/delete")
    public void delete(int id) {
        iSikayetlerService.delete(id);
    }

    @GetMapping("/getById")
    public Sikayetler getById(int id) {
        return iSikayetlerService.getById(id);
    }
}
