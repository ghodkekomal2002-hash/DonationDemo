package com.donation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.donation.entity.Donation;
import com.donation.repository.DonationRepository;

@Service
public class DonationService {

    @Autowired
    private DonationRepository repo;

    
    public Donation save(Donation donation) {
        return repo.save(donation);
    }

    
    public List<Donation> getAll() {
        return repo.findAll();
    }

    
    public Donation getById(int id) {
        return repo.findById(id).orElse(null);
    }

 
    public Donation update(int id, Donation donation) {
        Donation existing = repo.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(donation.getName());
            existing.setEmail(donation.getEmail());         
            existing.setMobileNo(donation.getMobileNo());    
            existing.setAddress(donation.getAddress());      
            existing.setAmount(donation.getAmount());
            existing.setMessage(donation.getMessage());
            return repo.save(existing);
        }
        return null;
    }

    
    public void delete(int id) {
        repo.deleteById(id);
    }
}