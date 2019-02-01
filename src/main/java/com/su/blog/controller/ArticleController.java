package com.su.blog.controller;

import com.su.blog.entity.Article;
import com.su.blog.exception.MyException;
import com.su.blog.service.ArticleService;
import jdk.jfr.internal.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Description: article资源接口
 *
 * @author Tianyu Su
 * @date 15:51 2019/01/28
 */
@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    /**
     * Description: 根据kindId获得该类别下的文章
     *
     * @author Tianyu Su
     * @date 2019/02/02
     */


    /**
     * Description: 给文章点赞
     *
     * @author Tianyu Su
     * @date 2019/02/02
     */
    @PutMapping("/like/{articleId}")
    @ResponseBody
    public ResponseEntity<Boolean> like(@PathVariable("articleId") int articleId) throws MyException{
        return ResponseEntity.ok(articleService.like(articleId));
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
     * Description: 删除文章
     *
     * @author Tianyu Su
     * @date 2019/02/02
     */
    @DeleteMapping("/{articleId}")
    @ResponseBody
    public ResponseEntity<Boolean> deleteArticle(@PathVariable("articleId") int articleId) throws MyException{
        return ResponseEntity.ok(articleService.deleteArticle(articleId));
    }
}
