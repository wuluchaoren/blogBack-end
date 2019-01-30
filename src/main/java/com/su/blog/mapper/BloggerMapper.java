package com.su.blog.mapper;

import com.su.blog.entity.Blogger;
import org.springframework.stereotype.Repository;

/**
 * Description:
 *
 * @author Tianyu Su
 * @date 23:04 2019/01/22
 */

@Repository
public interface BloggerMapper {
    /**
     * 通过id查找博主
     *
     * @param id
     * @return id为id的Blogger
     */
    Blogger findBloggerById(long id);

    /**
     * 通过id修改博主密码
     *
     * @param blogger
     * @return
     */
    boolean updateBloggerPasswordById(Blogger blogger);
}
