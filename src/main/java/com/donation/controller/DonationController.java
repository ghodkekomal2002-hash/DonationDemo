package com.donation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.donation.entity.Donation;
import com.donation.service.DonationService;

@RestController
@RequestMapping("/donations")
public class DonationController {

    @Autowired
    private DonationService service;

    
    @PostMapping
    public Donation create(@RequestBody Donation donation) {
        return service.save(donation);
    }

    
    @GetMapping
    public List<Donation> getAll() {
        return service.getAll();
    }

    
    @GetMapping("/{id}")
    public Donation getById(@PathVariable int id) {
        return service.getById(id);
    }

   
    @PutMapping("/{id}")
    public Donation update(@PathVariable int id, @RequestBody Donation donation) {
        return service.update(id, donation);
    }

   
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        service.delete(id);
        return "Deleted Successfully";
    }
}