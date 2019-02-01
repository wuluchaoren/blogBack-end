package com.su.blog.entity;

import java.util.List;

/**
 * Description:文章类别类
 *
 * @author Tianyu Su
 * @date 2019/1/27
 */
public class Kind {

    private int id;
    /**
     * 类别名称
     */
    private String name;
    /**
     * 类别下文章数目
     */
    private int number;

    //================关系=================
    /**
     * 一位博主
     */
    private Blogger blogger;
    /**
     * 多篇文章
     */
    private List<Article> articles;
    //==================getter and setter==============================

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Blogger getBlogger() {
        return blogger;
    }

    public void setBlogger(Blogger blogger) {
        this.blogger = blogger;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    //=========================toString=========================

    @Override
    public String toString() {
        return "Kind{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", blogger=" + blogger +
                ", articles=" + articles +
                '}';
    }
}