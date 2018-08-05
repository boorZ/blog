package com.zl.blog.controller;

import com.zl.blog.bean.Users;
import com.zl.blog.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UsersMapper usersMapper;

    @RequestMapping("/user_all")
    public String listStudent(Model model) {
        List<Users> all = usersMapper.findAll();
        model.addAttribute("all", all);
        return "index";
    }
}
