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
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){

        return "index";
    }
}
