package com.akademija.snkrhead.controller;

import com.akademija.snkrhead.entity.Shoe;
import com.akademija.snkrhead.service.ShoeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ShoeController {

    @Autowired
    private ShoeService shoeService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/viewShoes")
    public String viewShoes(Model model) {
        List<Shoe> shoeList = shoeService.getAllShoes();
        model.addAttribute("listOfShoes", shoeList);
        return "viewshoe.html";
    }

}
