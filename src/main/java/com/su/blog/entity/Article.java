package com.su.blog.entity;

import java.sql.Timestamp;

/**
 * Description:文章类 文章信息与文章内容分成两张表
 *
 * @author Tianyu Su
 * @date 2019/1/27
 */
public class Article {

    private int id;
    /**
     * 文章标题
     */
    private String title;
    /**
     * 属于哪个类
     */
    private int kindId;
    /**
     * 文章介绍
     */
    private String introduction;
    /**
     * 关键词
     */
    private String keyword;
    /**
     * 作者
     */
    private String writer;
    /**
     * 文件内容
     */
    private String content;
    /**
     * 作者是否推荐 0表示否 1表示推荐
     */
    private int support;
    /**
     * 点赞数
     */
    private int praiseNumber;
    /**
     * 发表时间
     */
    private Timestamp publicTime;
    /**
     * 出处
     */
    private String source;

    //===================关系====================
    /**
     * 一个类别
     */
    private Kind kind;
    /**
     * 一位博主
     */
    private Blogger blogger;

    //=========================getter and setter=============================


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getKindId() {
        return kindId;
    }

    public void setKindId(int kindId) {
        this.kindId = kindId;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getSupport() {
        return support;
    }

    public void setSupport(int support) {
        this.support = support;
    }

    public int getPraiseNumber() {
        return praiseNumber;
    }

    public void setPraiseNumber(int praiseNumber) {
        this.praiseNumber = praiseNumber;
    }

    public Timestamp getPublicTime() {
        return publicTime;
    }

    public void setPublicTime(Timestamp publicTime) {
        this.publicTime = publicTime;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }

    public Blogger getBlogger() {
        return blogger;
    }

    public void setBlogger(Blogger blogger) {
        this.blogger = blogger;
    }

    //======================toString===========================

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", kindId=" + kindId +
                ", introduction='" + introduction + '\'' +
                ", keyword='" + keyword + '\'' +
                ", writer='" + writer + '\'' +
                ", content='" + content + '\'' +
                ", support=" + support +
                ", praiseNumber=" + praiseNumber +
                ", publicTime=" + publicTime +
                ", source='" + source + '\'' +
                ", kind=" + kind +
                ", blogger=" + blogger +
                '}';
    }
}
