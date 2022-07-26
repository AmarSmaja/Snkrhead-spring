package com.akademija.snkrhead.service;

import com.akademija.snkrhead.entity.Shoe;
import com.akademija.snkrhead.repos.ShoeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoeService {

    @Autowired
    private ShoeRepository shoeRepository;

    public List<Shoe> getAllShoes() {
        List<Shoe> shoes = shoeRepository.findAll();
        return shoes;
    }

    public Shoe saveShoe(Shoe shoe) {
        return shoeRepository.save(shoe);
    }
}
