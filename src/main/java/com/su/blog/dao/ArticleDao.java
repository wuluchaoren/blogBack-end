package com.su.blog.dao;

import com.su.blog.entity.Article;
import com.su.blog.exception.MyException;
import com.su.blog.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Description:
 *
 * @author Tianyu Su
 * @date 2016/02/02
 */

@Repository
public class ArticleDao {
    @Autowired
    private ArticleMapper articleMapper;

    /**
     * Description:根据id找文章
     *
     * @author Tianyu Su
     * @date 2016/02/02
     */
    public Article findArticleById(int articleId) throws MyException{
        Article article=articleMapper.findArticleById(articleId);
        if(article==null){
            throw new MyException("未找到该文章！",MyException.NOT_FOUND_ERROR);
        }
        return article;
    }

    /**
     * Description:根据id给文章点赞
     *
     * @author Tianyu Su
     * @date 2016/02/02
     */
    public boolean updatePraiseNumberById(int articleId) throws MyException{
        try{
            articleMapper.findArticleById(articleId);
        }catch (Exception e){
            throw new MyException("错误！未找到该文章！",MyException.NOT_FOUND_ERROR);
        }
        if(!articleMapper.updateArticlePraiseNumberById(articleId)){
            throw new MyException("修改数据库错误，数据库处理错误！",MyException.ERROR);
        }
        return true;
    }

    /**
     * Description: 发布文章
     *
     * @author Tianyu Su
     * @date 2019/02/02
     */


    /**
     * Description: 修改文章内容和信息
     *
     * @author Tianyu Su
     * @date 2019/02/02
     */


    /**
     * Description:根据id删除文章
     *
     * @author Tianyu Su
     * @date 2016/02/02
     */
    public boolean deleteArticleById(int articleId) throws MyException{
        try{
            articleMapper.findArticleById(articleId);
        }catch (Exception e){
            throw new MyException("错误！未找到该文章！",MyException.NOT_FOUND_ERROR);
        }
        if(!articleMapper.deleteArticleById(articleId)){
            throw new MyException("删除错误，数据库处理错误！",MyException.ERROR);
        }
        return true;
    }
}
