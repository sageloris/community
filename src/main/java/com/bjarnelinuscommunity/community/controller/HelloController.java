/**
 * Copyright (C) 2020 MRStudio项目sage小组
 * FileName: HelloController
 * Author: sageL
 * Date: 2020/3/28 18:40
 * Description:
 * History:
 * <author>     <time>      <version>   <desc>
 * 作者姓名     修改时间      版本号       描述
 */

package com.bjarnelinuscommunity.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name") String name, Model model){
        model.addAttribute("name", name);
        return "hello";
    }
}
