package com.zl.blog.mapper;

import com.zl.blog.model.BlogContent;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author zhoulin
 * @date 2018/10/24
 */
@Mapper
public interface BlogContentMapper {
    @Select(value = "select * from blog_content where id = #{id}")
    BlogContent findById(int id);

    @Select(value = "select * from blog_content")
    List<BlogContent> findAll();

    @Insert(value = "insert into blog_content(categorys,lock_state,key_word,page_view,titles, contents, create_by, create_at) " +
            "values(#{categorys},#{lockState},#{keyWord},#{pageView},#{titles},#{contents},#{createBy},#{createAt})")
    void save(BlogContent user);

    @Update(value = "update blog_content set categorys = #{categorys}, lock_state = #{lockState},key_word=#{keyWord},page_view=#{pageView}," +
            "titles=#{titles}, contents=#{contents}, create_by=#{createBy}, create_at=#{createAt} where id=#{id}")
    void flush(BlogContent user);

    @Delete(value = "delete from blog_content where id=#{id}")
    void deleteById(Integer id);
}
