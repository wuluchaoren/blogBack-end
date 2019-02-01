package com.su.blog.mapper;

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
}
