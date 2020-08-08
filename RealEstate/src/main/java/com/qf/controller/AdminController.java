package com.qf.controller;

import com.qf.pojo.Admin;
import com.qf.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("login")
    @ResponseBody
    public Admin login(Admin admin, HttpServletRequest request) {
        admin = adminService.login(admin);
        if (admin != null) {
            System.out.println(admin);
            request.getSession().setAttribute("admin", admin);
        }
        return admin;
    }

    @RequestMapping("addAdmin")
    @ResponseBody
    public void addAdmin(Admin admin, HttpServletRequest request) {
        adminService.addAdmin(admin);
        request.getSession().setAttribute("admin", admin);
    }
}
