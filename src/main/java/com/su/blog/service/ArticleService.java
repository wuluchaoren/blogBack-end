package com.su.blog.service;

import com.su.blog.dao.ArticleDao;
import com.su.blog.dao.KindDao;
import com.su.blog.entity.Article;
import com.su.blog.exception.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 *
 * @author Tianyu Su
 * @date 2016/02/02
 */

@Service
public class ArticleService {
    @Autowired
    private ArticleDao articleDao;

    @Autowired
    private KindDao kindDao;

    /**
     * Description:根据id给文章点赞
     *
     * @author Tianyu Su
     * @date 2016/02/02
     */
    public boolean like(int articleId) throws MyException{
        return articleDao.updatePraiseNumberById(articleId);
    }

    /**
     * Description: 发布文章
     *
     * @author Tianyu Su
     * @date 2019/02/04
     */
    public boolean createArticle(Article article) throws MyException{
        if(!articleDao.createArticle(article)){
            throw new MyException("新增文章出错!数据库插入错误!",MyException.ERROR);
        }
        if(!kindDao.alterNumberById(article.getKindId())){
            throw new MyException("新增文章出错!数据库插入错误!",MyException.ERROR);
        }
        return true;
    }

    /**
     * Description: 修改文章内容和信息
     *
     * @author Tianyu Su
     * @date 2019/02/02
     */
    public boolean alterArticle(Article article) throws MyException{
        if(article.getId()==0){
            throw new MyException("找不到该文章！",MyException.NOT_FOUND_ERROR);
        }
        return articleDao.alterArticleById(article);
    }

    /**
     * Description:根据id删除文章
     *
     * @author Tianyu Su
     * @date 2016/02/02
     */
    public boolean deleteArticle(int articleId) throws MyException{
        return articleDao.deleteArticleById(articleId);
    }

    /**
     * Description:根据标题或关键字搜索文章
     *
     * @author Tianyu Su
     * @date 2016/02/02
     */
    public List<Article> findArticle(String info) throws MyException{
        return articleDao.findArticle(info);
    }
}
