package com.zl.blog.controller;

import com.github.pagehelper.PageInfo;
import com.zl.blog.model.User;
import com.zl.blog.service.UserService;
import com.zl.blog.utils.ZlUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author zhoulin
 * @date 2018/8/17
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("hello")
    public String hellos(){
        return "index3";
    }

    @PutMapping(value = "/findSaveAndFlush")
    public void put(User user){
        userService.saveAndFlush(user);
    }

    @PostMapping("/addone")
    public ZlUtils add(User user){
        return userService.saveAndFlush(user);
    }

    @GetMapping("/findone")
    public User get(Integer id){
        return userService.findById(id);
    }

    @RequestMapping(value = "/findAll")
    public PageInfo<User> gets(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum,
                               @RequestParam(value = "pageSize",defaultValue = "1")int pageSize){
        System.out.println("====A" + pageNum);
        System.out.println("====B" + pageSize);
        return  userService.findAll(pageNum, pageSize);
    }

    @DeleteMapping(value = "/deleteone")
    public void del(Integer id){
        userService.deleteById(id);
    }
}
