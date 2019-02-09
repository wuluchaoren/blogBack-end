package com.su.blog.controller;

import com.su.blog.entity.Article;
import com.su.blog.exception.MyException;
import com.su.blog.service.ArticleService;
import com.su.blog.service.KindService;
import com.su.blog.utils.JsonUtils;
import com.su.blog.vo.ArticleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

    @Autowired
    private KindService kindService;

    /**
     * Description: 根据kindId获得该类别下的文章list
     *
     * @author Tianyu Su
     * @date 2019/02/02
     */
    @GetMapping("/selectArticle/{kindId}")
    @ResponseBody
    public List<ArticleVO> findArticle(@PathVariable("kindId") int kindId) throws MyException {
        List<ArticleVO> kindArticleVOS = new ArrayList<>();
        List<Article> articles = kindService.findArticle(kindId);
        for (Article article : articles) {
            kindArticleVOS.add(new ArticleVO(article));
        }
        return kindArticleVOS;
    }

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
    @PostMapping("/createArticle/")
    @ResponseBody
    public ResponseEntity<Boolean> createArticle(@RequestBody Map<String,String> map) throws MyException{
        Article article=new Article();
        article.setTitle(map.get("title"));
        article.setKeyword(map.get("keyword"));
        article.setKindId(Integer.parseInt(map.get("kindId")));
        article.setContent(map.get("content"));
        article.setSupport(Integer.parseInt(map.get("support")));
        article.setWriter(map.get("writer"));
        article.setIntroduction(map.get("introduction"));
        article.setSource(map.get("source"));
        article.setPraiseNumber(0);
        article.setPublicTime(JsonUtils.stringToTimestamp(map.get("publicTime")));
        return ResponseEntity.ok(articleService.createArticle(article));
    }

    /**
     * Description: 修改文章内容和信息
     *
     * @author Tianyu Su
     * @date 2019/02/02
     */
    @PutMapping("/alterArticle/{articleId}")
    @ResponseBody
    public ResponseEntity<Boolean> alterArticle(@PathVariable("articleId") int articleId,@RequestBody Map<String,String> map) throws MyException{
        Article article=new Article();
        article.setId(articleId);
        article.setTitle(map.get("title"));
        article.setWriter(map.get("writer"));
        article.setSource(map.get("source"));
        article.setKeyword(map.get("keyword"));
        article.setIntroduction(map.get("introduction"));
        article.setContent(map.get("content"));
        article.setSupport(Integer.parseInt(map.get("support")));
        return ResponseEntity.ok(articleService.alterArticle(article));
    }

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

    /**
     * Description: 根据关键字或者标题搜索文章
     *
     * @author Tianyu Su
     * @date 2019/02/02
     */
    @GetMapping("/findArticle/{info}")
    @ResponseBody
    public List<ArticleVO> findArticle(@PathVariable("info") String info) throws MyException{
        List<Article> list=articleService.findArticle(info);
        List<ArticleVO> articleVOS=new ArrayList<>();
        for(Article article:list) {
            articleVOS.add(new ArticleVO(article));
        }
        return articleVOS;
    }
}
