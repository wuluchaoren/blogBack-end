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
    Blogger findBloggerById(int id);

    /**
     * 通过id修改博主密码
     *
     * @param blogger
     * @return 更新出错返回false否则返回true
     */
    boolean updateBloggerPasswordById(Blogger blogger);

    /**
     * 通过id修改博主个人信息
     *
     * @param blogger
     * @return 更新出错返回false否则返回true
     */
    boolean updateBloggerProfileById(Blogger blogger);

}
