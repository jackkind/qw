package com.wq.etrading.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hspcadmin on 2018/1/31.
 * 首页
 */
@Controller
@RequestMapping("/index/")
public class IndexController {

    private final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping("index")
    public String index (Model model){
        logger.info("---开始进入首页---");
        return "/index/index";
    }

}
