package com.coy.springbootWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName IndeController
 * @Date 2019/7/4 0:46
 **/

@Controller
public class IndeController {
    @RequestMapping("/index")
    @ResponseBody
    public Map<String, String>index(){
        Map map = new HashMap();
        map.put("程曦", "python程序员");
        map.put("余泽峰", "前端程序员");
        return map;

    }

}
