package com.ck.controller;

import com.ck.service.RoleService;
import com.ck.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by ChiKuo on 2018/7/4.
 */
@Controller
public class RoleController {

    @Autowired
    private RoleService roleService = null;

    @RequestMapping("/role/getRole")
    @ResponseBody
    public Role getRole(@RequestParam("id") int id) {
        Role r = roleService.getRole(id);
        return r;
    }

    @RequestMapping("/role/insert")
    public void getRole() {
        Role role = new Role();
        role.setRoleName("qqq");
        role.setNote("hhh");
        System.out.println("hello");
        roleService.insertRole(role);

    }


}
