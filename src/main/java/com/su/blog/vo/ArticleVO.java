package com.su.blog.vo;

import com.su.blog.entity.Article;

import java.sql.Timestamp;

/**
 * Description: ArticleVO，用于获得文章list
 *
 * @author Tianyu Su
 * @date 2019/02/02
 */
public class ArticleVO {
    private Integer id;
    private String title;
    private Integer kindId;
    private String introduction;
    private String keyword;
    private String writer;
    private String content;
    private Integer support;
    private Integer praiseNumber;
    private Timestamp publicTime;
    private String source;

    public ArticleVO(Article article){
        id=article.getId();
        title=article.getTitle();
        kindId=article.getKindId();
        introduction=article.getIntroduction();
        keyword=article.getKeyword();
        writer=article.getWriter();
        content=article.getContent();
        support=article.getSupport();
        praiseNumber=article.getPraiseNumber();
        publicTime=article.getPublicTime();
        source=article.getSource();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getKindId() {
        return kindId;
    }

    public void setKindId(Integer kindId) {
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

    public Integer getSupport() {
        return support;
    }

    public void setSupport(Integer support) {
        this.support = support;
    }

    public Integer getPraiseNumber() {
        return praiseNumber;
    }

    public void setPraiseNumber(Integer praiseNumber) {
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

    @Override
    public String toString() {
        return "ArticleVO{" +
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
                '}';
    }
}
