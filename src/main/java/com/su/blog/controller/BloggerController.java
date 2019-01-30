package com.su.blog.controller;

import com.su.blog.entity.Blogger;
import com.su.blog.service.BloggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
     * 修改博主个人信息
     */
    @PutMapping
    @ResponseBody
    public ResponseEntity<Boolean> alterProfile(@RequestBody Map<String,String> map) throws Exception{

        //return ResponseEntity.ok(bloggerService.alterProfile());
        return ResponseEntity.ok(true);
    }

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
