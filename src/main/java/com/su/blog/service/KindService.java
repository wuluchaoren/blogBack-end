package com.su.blog.service;

import com.su.blog.dao.KindDao;
import com.su.blog.entity.Article;
import com.su.blog.entity.Kind;
import com.su.blog.exception.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



/**
 * Description:
 *
 * @author Tianyu Su
 * @date 2019/2/1
 */
@Service
public class KindService {

    @Autowired
    private KindDao kindDao;

    /**
     * Description:获取所有kind信息
     *
     * @author Tianyu Su
     * @date 2019/02/01
     */
    public List<Kind> listAllKinds() {
        return kindDao.listAllKinds();
    }

    /**
     * Description:修改kind信息（只能修改名字）
     *
     * @author Tianyu Su
     * @date 2019/02/01
     */
    public boolean alterKind(Kind kind) throws MyException{
        if(kind.getId()==0){
            throw new MyException("id不能为空", MyException.ERROR);
        }
        return kindDao.alterKindById(kind);
    }

    /**
     * Description:删除kind
     *
     * @author Tianyu Su
     * @date 2019/02/01
     */
    public boolean deleteKind(int kindId) throws MyException{
        return kindDao.deleteKindById(kindId);
    }

    /**
     * Description:新建kind
     *
     * @author Tianyu Su
     * @date 2019/02/01
     */
    public boolean createKind(Kind kind) throws MyException{
        if(!kindDao.insertKind(kind)){
            throw new MyException("新增类别出错!数据库插入错误!",MyException.ERROR);
        }
        return true;
    }

    /**
     * Description:获得kind下的文章
     *
     * @author Tianyu Su
     * @date 2019/02/01
     */
    public List<Article> findArticle(int kindId) throws MyException{
        return kindDao.findArticleById(kindId);
    }
}
