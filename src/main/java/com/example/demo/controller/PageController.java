package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/home")
    public String homePage() {
        return "home";
    }

    @GetMapping("/dashboard")
    public String dashboardPage() {
        return "dashboard";
    }

    @GetMapping("/pet-services")
    public String petservicesPage() {
        return "pet-services";
    }

    @GetMapping("/my-pets")
    public String myPetsPage() {
        return "my-pets";
    }

    @GetMapping("/add-pet")
    public String addPetPage() {
        return "add-pet";
    }

    // Both URLs open the SAME My Bookings template.
    @GetMapping({"/my-bookings", "/my-bookings.html"})
    public String myBookingsPage() {
        return "my-bookings";
    }

    @GetMapping("/checkout")
    public String checkout() {
        return "checkout";
    }

    @GetMapping("/order-success")
    public String orderSuccess() {
        return "order-success";
    }
}
