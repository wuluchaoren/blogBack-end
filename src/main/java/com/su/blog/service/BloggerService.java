package com.su.blog.service;

import com.su.blog.dao.BloggerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Description: blogger业务逻辑
 *
 * @author Tianyu Su
 * @date 23:04 2019/01/22
 */

@Service
public class BloggerService {
    @Autowired
    private BloggerDao bloggerDao;


}
