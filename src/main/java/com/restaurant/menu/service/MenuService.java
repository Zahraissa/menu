package com.restaurant.menu.service;

import com.restaurant.menu.model.Menu;
import com.restaurant.menu.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService implements MenuServices {
    @Autowired
    private MenuRepository menuRepository;

    @Override
    public void saveMenu(Menu menu) {
        menuRepository.save(menu);
    }

    @Override
    public List<Menu> getInfo() {
        return menuRepository.findAll();
    }

    @Override
    public Menu getMenuById(long id) {
        return null;
    }

    @Override
    public void deleteMenu(long id) {
        menuRepository.deleteById(id);
    }
}
