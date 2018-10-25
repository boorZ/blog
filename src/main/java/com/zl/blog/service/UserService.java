package com.zl.blog.service;

import com.github.pagehelper.PageInfo;
import com.zl.blog.model.User;
import com.zl.blog.utils.ZlUtils;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    PageInfo<User> findAll(int pageNum, int pageSize);

    User findById(Integer id);

    ZlUtils saveAndFlush(User user);

    ZlUtils deleteById(Integer id);
}