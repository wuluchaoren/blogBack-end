package com.su.blog.vo;

import com.su.blog.entity.Kind;

/**
 * Description:
 *
 * @author Tianyu Su
 * @date 2019/2/1
 */
public class KindVO {
    private Integer id;
    private Integer number;
    private String name;

    public KindVO(Kind kind){
        id=kind.getId();
        number=kind.getNumber();
        name=kind.getName();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "KindVO{" +
                "id=" + id +
                ", number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}
