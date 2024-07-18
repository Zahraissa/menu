package com.restaurant.menu.service;

import com.restaurant.menu.model.Admin;
import com.restaurant.menu.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService  implements  AdminServices{
    @Autowired
    private AdminRepository adminRepository;
    @Override
    public  Admin saveAdmin(Admin admin) {
        return adminRepository.save(admin);
    }
}
