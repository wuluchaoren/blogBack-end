package com.su.blog.entity;

import java.util.List;

/**
 * Description:博主类
 *
 * @author Tianyu Su
 * @date 2019/1/27
 */
public class Blogger {

    private int id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别
     */
    private String sex;
    /**
     * 密码 发表/修改/删除时需要验证密码
     */
    private String password;
    /**
     * 年龄
     */
    private int age;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 职业
     */
    private String job;
    /**
     * Github地址
     */
    private String github;
    /**
     * 微博
     */
    private String weibo;
    /**
     * 爱好
     */
    private String interests;
    /**
     * 座右铭
     */
    private String motto;
    //================关系===================
    /**
     * 多个文章类别
     */
    private List<Kind> kinds;
    /**
     * 多篇文章
     */
    private List<Article> articles;
    //==============getter and setter=================


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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getWeibo() {
        return weibo;
    }

    public void setWeibo(String weibo) {
        this.weibo = weibo;
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public List<Kind> getKinds() {
        return kinds;
    }

    public void setKinds(List<Kind> kinds) {
        this.kinds = kinds;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
    //==================toString=======================

    @Override
    public String toString() {
        return "Blogger{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", job='" + job + '\'' +
                ", github='" + github + '\'' +
                ", weibo='" + weibo + '\'' +
                ", interests='" + interests + '\'' +
                ", motto='" + motto + '\'' +
                ", kinds=" + kinds +
                ", articles=" + articles +
                '}';
    }
}
