package com.su.blog.mapper;

import com.su.blog.entity.Article;
import com.su.blog.entity.Kind;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Description:
 *
 * @author Tianyu Su
 * @date 2019/02/01
 */

@Repository
public interface KindMapper {
    /**
     * 查找所有kind
     *
     * @return 所有kind
     */
    List<Kind> listAll();

    /**
     * 根据id查找kind
     * @param id
     * @return 查找的kind
     */
    Kind findKindById(int id);

    /**
     * 新增kind
     * @param kind
     * @return 新建成功返回true，失败返回false
     */
    boolean insertKind(Kind kind);

    /**
     * 根据id删除kind
     * @param id
     * @return 删除成功返回true，失败返回false
     */
    boolean deleteKindById(int id);

    /**
     * 查找所有kind
     * @param kind
     * @return 修改成功返回true，失败返回false
     */
    boolean updateKindById(Kind kind);

    /**
     * 查找属于该kind下的文章
     * @param kindId
     * @return 返回该类别下的所有文章
     */
    List<Article> findArticleById(int kindId);
}
