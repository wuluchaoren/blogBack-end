package com.su.blog.controller;

import com.su.blog.entity.Blogger;
import com.su.blog.exception.MyException;
import com.su.blog.service.BloggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Description: blogger资源接口
 *
 * @author Tianyu Su
 * @date 23:04 2019/01/22
 */

@RestController
@RequestMapping("/blogger")
public class BloggerController {
    @Autowired
    private BloggerService bloggerService;

    /**
     * Description:获得博主信息
     *
     * @author Tianyu Su
     * @date 2019/01/24
     */
    @GetMapping("/information/{id}")
    @ResponseBody
    public ResponseEntity<Map<String,Object>>getInformation(@PathVariable("id") int id) throws MyException{
        Blogger blogger=bloggerService.getBloggerById(id);
        Map<String,Object> m=new HashMap<>();
        m.put("name",blogger.getName());
        m.put("sex",blogger.getSex());
        m.put("password",blogger.getPassword());
        m.put("age",blogger.getAge());
        m.put("email",blogger.getEmail());
        m.put("job",blogger.getJob());
        m.put("github",blogger.getGithub());
        m.put("interests",blogger.getInterests());
        m.put("weibo",blogger.getWeibo());
        m.put("motto",blogger.getMotto());
        return ResponseEntity.ok(m);
    }

    /**
     * Description:修改博主个人信息
     *
     * @author Tianyu Su
     * @date 2019/01/24
     */
    @PutMapping("/information")
    @ResponseBody
    public ResponseEntity<Boolean> alterProfile(@RequestBody Map<String,String> map) throws Exception{
        Blogger blogger=new Blogger();
        blogger.setId(Integer.parseInt(map.get("id")));
        blogger.setAge(Integer.parseInt(map.get("age")));
        blogger.setEmail(map.get("email"));
        blogger.setGithub(map.get("github"));
        blogger.setInterests(map.get("interests"));
        blogger.setJob(map.get("job"));
        blogger.setMotto(map.get("motto"));
        blogger.setName(map.get("name"));
        blogger.setSex(map.get("sex"));
        blogger.setWeibo(map.get("weibo"));
        return ResponseEntity.ok(bloggerService.alterProfile(blogger));
    }

    /**
     * Description:修改博主密码
     *
     * @author Tianyu Su
     * @date 2019/01/24
     */
    @PutMapping("/password")
    @ResponseBody
    public ResponseEntity<Boolean> alterPassword(@RequestBody Map<String,String> map) throws  Exception{
        Blogger blogger=new Blogger();
        //验证旧密码和判断新老密码的不同的工作放在前端
        blogger.setId(Integer.parseInt(map.get("id")));
        blogger.setPassword(map.get("password"));
        return ResponseEntity.ok(bloggerService.alterPassword(blogger));
    }
}
