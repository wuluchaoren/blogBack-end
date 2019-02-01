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

    /**
     * Description:根据id寻找博主
     *
     * @author Tianyu Su
     * @date 2019/01/24
     */
    public Blogger getBloggerById(int id) throws MyException{
        Blogger blogger=bloggerMapper.findBloggerById(id);
        if(blogger==null){
            throw new MyException("找不到博主!",MyException.NOT_FOUND_ERROR);
        }
        return blogger;
    }

    /**
     * Description:根据id修改博主密码
     *
     * @author Tianyu Su
     * @date 2019/01/24
     */
    public boolean alterPasswordById(Blogger blogger) throws MyException{
        try{
            bloggerMapper.findBloggerById(blogger.getId());
        }catch (Exception e){
            throw new MyException("错误！未找到博主！",MyException.NOT_FOUND_ERROR);
        }
        if(!bloggerMapper.updateBloggerPasswordById(blogger)){
            throw new MyException("修改数据库错误，数据库处理错误！",MyException.ERROR);
        }
        return true;
    }

    /**
     * Description:根据id修改博主信息
     *
     * @author Tianyu Su
     * @date 2019/01/24
     */
    public boolean alterProfileById(Blogger blogger) throws MyException{
        try{
            bloggerMapper.findBloggerById(blogger.getId());
        }catch (Exception e){
            throw new MyException("错误！未找到博主！",MyException.NOT_FOUND_ERROR);
        }
        if(!bloggerMapper.updateBloggerProfileById(blogger)){
            throw new MyException("修改数据库错误，数据库处理错误！",MyException.ERROR);
        }
        return true;
    }
}
