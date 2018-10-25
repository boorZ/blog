package com.zl.blog.controller;

import com.github.pagehelper.PageInfo;
import com.zl.blog.model.BlogContent;
import com.zl.blog.service.BlogContentService;
import com.zl.blog.utils.ZlUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author zhoulin
 * @date 2018/8/17
 */
@RestController
@RequestMapping("blog")
public class BlogContentController {
    @Autowired
    private BlogContentService userService;

    @RequestMapping("hello")
    public String hellos(){
        return "index3";
    }

    @PutMapping(value = "/findSaveAndFlush")
    public void put(BlogContent user){
        userService.saveAndFlush(user);
    }

    @PostMapping("/addone")
    public ZlUtils add(BlogContent user){
        return userService.saveAndFlush(user);
    }

    @GetMapping("/findone")
    public BlogContent get(Integer id){
        return userService.findById(id);
    }

    @RequestMapping(value = "/findAll")
    public PageInfo<BlogContent> gets(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum,
                               @RequestParam(value = "pageSize",defaultValue = "1")int pageSize){
        return  userService.findAll(pageNum, pageSize);
    }

    @DeleteMapping(value = "/deleteone")
    public void del(Integer id){
        userService.deleteById(id);
    }
}
