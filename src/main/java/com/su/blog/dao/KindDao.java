package com.su.blog.dao;

import com.su.blog.entity.Article;
import com.su.blog.entity.Kind;
import com.su.blog.exception.MyException;
import com.su.blog.mapper.KindMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Description:
 *
 * @author Tianyu Su
 * @date 2019/02/01
 */

@Repository
public class KindDao {

    @Autowired
    private KindMapper kindMapper;

    /**
     * Description:获取所有kind信息
     *
     * @author Tianyu Su
     * @date 2019/02/01
     */
    public List<Kind> listAllKinds(){
        return kindMapper.listAll();
    }

    /**
     * Description:根据id修改kind信息
     *
     * @author Tianyu Su
     * @date 2019/02/01
     */
    public boolean alterKindById(Kind kind) throws MyException{
        try{
            kindMapper.findKindById(kind.getId());
        }catch (Exception e){
            throw new MyException("错误！未找到类别！",MyException.NOT_FOUND_ERROR);
        }
        if(!kindMapper.updateKindById(kind)){
            throw new MyException("修改kind错误，数据库修改出错！",MyException.ERROR);
        }
        return true;
    }

    /**
     * Description:根据id删除kind
     *
     * @author Tianyu Su
     * @date 2019/02/01
     */
    public boolean deleteKindById(int id) throws MyException{
        try{
            kindMapper.findKindById(id);
        }catch (Exception e){
            throw new MyException("错误！未找到类别！",MyException.NOT_FOUND_ERROR);
        }
        if(!kindMapper.deleteKindById(id)){
            throw new MyException("删除kind错误，数据库修改出错！",MyException.ERROR);
        }
        return true;
    }

    /**
     * Description:新增kind
     *
     * @author Tianyu Su
     * @date 2019/02/01
     */
    public boolean insertKind(Kind kind) throws MyException{
        if(!kindMapper.insertKind(kind)){
            throw new MyException("新建kind错误，数据库修改出错！",MyException.ERROR);
        }
        return true;
    }

    /**
     * Description:根据kindId获得该类别的文章
     *
     * @author Tianyu Su
     * @date 2019/02/02
     */
    public List<Article> findArticleById(int kindId) throws MyException{
        try{
            kindMapper.findKindById(kindId);
        }catch (Exception e){
            throw new MyException("错误！未找到类别！",MyException.NOT_FOUND_ERROR);
        }
        return kindMapper.findArticleById(kindId);
    }

    /**
     * Description:新增文章时修改所属kind的文章数
     *
     * @author Tianyu Su
     * @date 2019/02/04
     */
    public boolean alterNumberById(int kindId) throws MyException{
        return kindMapper.alterNumberById(kindId);
    }
}
