package com.su.blog.service;

import com.su.blog.dao.KindDao;
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
}
