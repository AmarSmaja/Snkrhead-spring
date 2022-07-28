package com.akademija.snkrhead.controller;

import com.akademija.snkrhead.entity.*;
import com.akademija.snkrhead.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ShoeController {

    @Autowired
    private ShoeService shoeService;
    @Autowired
    private SupplierService supplierService;
    @Autowired
    private UserService userService;
    @Autowired
    private BuyerService buyerService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/admin")
    public String getAdminPanel() {
        return "admin";
    }

    @GetMapping("/viewShoes")
    public String viewShoes(Model model) {
        List<Shoe> shoeList = shoeService.getAllShoes();
        model.addAttribute("listOfShoes", shoeList);
        return "viewshoe.html";
    }

    @GetMapping("/viewSuppliers")
    public String viewSuppliers(Model model) {
        List<Supplier> supplierList = supplierService.getAllSuppliers();
        model.addAttribute("listOfSuppliers", supplierList);
        return "viewsupplier.html";
    }

    @GetMapping("/viewUsers")
    public String viewUsers(Model model) {
        List<User> userList = userService.getAllUsers();
        model.addAttribute("listOfUsers", userList);
        return "viewusers.html";
    }

    @GetMapping("/viewBuyers")
    public String viewBuyers(Model model) {
        List<Buyer> buyerList = buyerService.getAllBuyers();
        model.addAttribute("listOfBuyers", buyerList);
        return "viewbuyers.html";
    }

    @GetMapping("/register")
    public String showRegister(Model model) {
        User user = new User();
        model.addAttribute("emptyUser", user);
        return "register.html";
    }

    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("emptyUser") User user) {
        userService.saveUser(user);
        return "redirect:/";
    }
}