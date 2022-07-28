package com.akademija.snkrhead.service;

import com.akademija.snkrhead.entity.Buyer;
import com.akademija.snkrhead.repos.BuyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyerService {

    @Autowired
    private BuyerRepository buyerRepository;

    public List<Buyer> getAllBuyers() {
        List<Buyer> buyers = buyerRepository.findAll();
        return buyers;
    }

    public Buyer saveBuyer(Buyer buyer) {
        return buyerRepository.save(buyer);
    }
}
