package com.zl.blog.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zl.blog.mapper.UserMapper;
import com.zl.blog.model.User;
import com.zl.blog.service.UserService;
import com.zl.blog.utils.ZlUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public PageInfo<User> findAll(int pageNum, int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<User> all = userMapper.findAll();
        return new PageInfo<>(all);
    }

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public ZlUtils saveAndFlush(User user) {
        if(user.getId() == null){
            System.out.println("ADD");
            userMapper.save(user);
            return ZlUtils.Success(null);
        }else{
            System.out.println("PUU");
            userMapper.flush(user);
            return ZlUtils.Success(null);
        }
    }

    @Override
    public ZlUtils deleteById(Integer id) {
        userMapper.deleteById(id);
        return ZlUtils.Success(null);
    }

}