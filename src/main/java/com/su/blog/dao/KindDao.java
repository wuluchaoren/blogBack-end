package com.su.blog.dao;

import com.su.blog.entity.Kind;
import com.su.blog.mapper.KindMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Description:
 *
 * @author Tianyu Su
 * @date 2019/02/01
 */

@Repository
public class KindDao {

    @Autowired
    private KindMapper kindMapper;

    /**
     * Description:获取所有kind信息
     *
     * @author Tianyu Su
     * @date 2019/02/01
     */
    public List<Kind> listAllKinds(){
        return kindMapper.listAll();
    }
}
