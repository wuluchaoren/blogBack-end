package com.su.blog.mapper;

import com.su.blog.entity.Article;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Description:
 *
 * @author Tianyu Su
 * @date 2016/02/02
 */

@Repository
public interface ArticleMapper {

    /**
     * 根据id更新文章点赞数
     *
     * @param id
     * @return 更新成功返回true，失败返回false
     */
    boolean updateArticlePraiseNumberById(int id);

    /**
     * 根据id查找文章
     *
     * @param id
     * @return 查找到的article
     */
    Article findArticleById(int id);

    /**
     * 根据id删除文章
     *
     * @param id
     * @return 删除成功返回true，失败返回false
     */
    boolean deleteArticleById(int id);

    /**
     * 发布新文章
     *
     * @param article
     * @return 发布成功返回true，失败返回false
     */
    boolean insertArticle(Article article);

    /**
     * 修改文章
     *
     * @param article
     * @return 修改成功返回true，失败返回false
     */
    boolean updateArticleById(Article article);

    /**
     * 根据标题或者关键字搜索文章
     *
     * @param info
     * @return 返回符合要求的文章list
     */
    List<Article> findArticleByInfo(String info);
}
