package com.su.blog.controller;


import com.su.blog.entity.Kind;
import com.su.blog.exception.MyException;
import com.su.blog.service.KindService;
import com.su.blog.vo.KindVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Description: kind资源接口
 *
 * @author Tianyu Su
 * @date 2019/01/28
 */
@RestController
@RequestMapping("/kind")
public class KindController {

    @Autowired
    private KindService kindService;

    /**
     * Description:获取所有kind信息
     *
     * @author Tianyu Su
     * @date 2019/02/01
     */
    @GetMapping
    @ResponseBody
    public List<KindVO> listAllKinds() throws MyException {
        List<Kind> list= kindService.listAllKinds();
        List<KindVO> kindVOS=new ArrayList<>();
        for(Kind kind : list){
            kindVOS.add(new KindVO(kind));
        }
        return kindVOS;
    }

    /**
     * Description:修改kind
     *
     * @author Tianyu Su
     * @date 2019/02/01
     */

    /**
     * Description:删除kind
     *
     * @author Tianyu Su
     * @date 2019/02/01
     */

    /**
     * Description:新增kind
     *
     * @author Tianyu Su
     * @date 2019/02/01
     */

}
