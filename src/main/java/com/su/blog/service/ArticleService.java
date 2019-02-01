package com.su.blog.service;

import com.su.blog.dao.ArticleDao;
import com.su.blog.exception.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public boolean deleteArticle(int articleId) throws MyException{
        return articleDao.deleteArticleById(articleId);
    }
}
