package com.su.blog.dao;

import com.su.blog.entity.Blogger;
import com.su.blog.exception.MyException;
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

    public boolean alterPasswordById(Blogger blogger) throws MyException{
        Blogger temp;
        try{
            temp=bloggerMapper.findBloggerById(blogger.getId());
        }catch(Exception e){
            throw new MyException("错误！未找到博主！",MyException.NOT_FOUND_ERROR);
        }
        try{
            temp.setPassword(blogger.getPassword());
            bloggerMapper.updateBloggerPasswordById(temp);
        }catch (Exception e){
            throw new MyException("修改数据库错误，数据库处理错误！",MyException.ERROR);
        }
        return true;
    }
}
