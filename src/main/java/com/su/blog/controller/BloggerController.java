package com.su.blog.controller;

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
}
