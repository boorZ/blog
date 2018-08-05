package com.zl.blog.mapper;

import com.zl.blog.bean.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UsersMapper {
    @Select("SELECT * FROM users")
    List<Users> findAll();
}
