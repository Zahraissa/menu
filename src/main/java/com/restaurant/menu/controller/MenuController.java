package com.restaurant.menu.controller;

import com.restaurant.menu.model.Menu;
import com.restaurant.menu.service.MenuServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("menu")
@CrossOrigin
public class MenuController {
    @Autowired
    private MenuServices menuServices;

    @PostMapping("/add")
    public String saveMenu(@RequestBody Menu menu) {
        menuServices.saveMenu(menu);
        return "menu added";
    }

    @GetMapping("/get")
    public List<Menu> getInfo() {
        return menuServices.getInfo();
    }
}
