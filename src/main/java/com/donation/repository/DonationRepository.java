package com.donation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.donation.entity.Donation;

public interface DonationRepository extends JpaRepository<Donation,Integer>{

}
