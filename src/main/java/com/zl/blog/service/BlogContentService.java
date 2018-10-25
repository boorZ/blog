package com.zl.blog.service;

import com.github.pagehelper.PageInfo;
import com.zl.blog.model.BlogContent;
import com.zl.blog.utils.ZlUtils;
import org.springframework.stereotype.Service;

@Service
public interface BlogContentService {
    PageInfo<BlogContent> findAll(int pageNum, int pageSize);

    BlogContent findById(Integer id);

    ZlUtils saveAndFlush(BlogContent user);

    ZlUtils deleteById(Integer id);
}