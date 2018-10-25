package com.zl.blog.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zl.blog.mapper.BlogContentMapper;
import com.zl.blog.model.BlogContent;
import com.zl.blog.service.BlogContentService;
import com.zl.blog.utils.ZlUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BlogContentServiceImpl implements BlogContentService {

    @Autowired
    private BlogContentMapper blogContentMapper;

    @Override
    public PageInfo<BlogContent> findAll(int pageNum, int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<BlogContent> all = blogContentMapper.findAll();
        return new PageInfo<>(all);
    }

    @Override
    public BlogContent findById(Integer id) {
        return blogContentMapper.findById(id);
    }

    @Override
    public ZlUtils saveAndFlush(BlogContent blogContent) {
        if(blogContent.getId() == null){
            System.out.println("ADD");
            blogContentMapper.save(blogContent);
            return ZlUtils.Success(null);
        }else{
            System.out.println("PUU");
            blogContentMapper.flush(blogContent);
            return ZlUtils.Success(null);
        }
    }

    @Override
    public ZlUtils deleteById(Integer id) {
        blogContentMapper.deleteById(id);
        return ZlUtils.Success(null);
    }

}