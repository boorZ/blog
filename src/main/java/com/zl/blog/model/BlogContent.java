package com.zl.blog.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhoulin
 * @date 2018/10/24
 */
public class BlogContent implements Serializable {
    private Integer id;
    /** 类别 **/
    private String categorys;
    /**状态 **/
    private String lockState;
    /** 关键字 **/
    private String keyWord;
    /** 浏览量 **/
    private Integer pageView;
    /** 标题 **/
    private String titles;
    /** 内容 **/
    private String contents;
    /** 操作人 **/
    private String createBy;
    /** 添加时间 **/
    private Date createAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategorys() {
        return categorys;
    }

    public void setCategorys(String categorys) {
        this.categorys = categorys;
    }

    public String getLockState() {
        return lockState;
    }

    public void setLockState(String lockState) {
        this.lockState = lockState;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public Integer getPageView() {
        return pageView;
    }

    public void setPageView(Integer pageView) {
        this.pageView = pageView;
    }

    public String getTitles() {
        return titles;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
