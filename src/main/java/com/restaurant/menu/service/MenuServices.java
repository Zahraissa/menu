package com.restaurant.menu.service;

import com.restaurant.menu.model.Menu;

import java.util.List;

public interface MenuServices {
    public void saveMenu(Menu menu);
    public List<Menu>getInfo();
    Menu getMenuById(long id);
    void deleteMenu(long id);
}
