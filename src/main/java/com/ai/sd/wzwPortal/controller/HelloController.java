package com.ai.sd.wzwPortal.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 潘旭东
 * @Date: 2019/2/23 11:02
 * @remark bug no no no
 */

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index() {
        return "Hello wzwPortal";
    }
    
}
