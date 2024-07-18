package com.restaurant.menu.controller;


import com.restaurant.menu.model.Admin;
import com.restaurant.menu.service.AdminServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("admin")
@CrossOrigin
public class AdminController {
    @Autowired
    private AdminServices adminServices;

    @PostMapping("/add")
    public String saveAdmin(@RequestBody  Admin admin){
        adminServices.saveAdmin(admin);
        return "admin added";
    }
}
