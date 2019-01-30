package com.su.blog.dao;

import com.su.blog.mapper.BloggerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * Description:
 *
 * @author Tianyu Su
 * @date 00:15 2019/01/23
 */

@Repository
public class BloggerDao {
    @Autowired
    private BloggerMapper bloggerMapper;
}
