package com.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 注意声明为controller，但是bean要么手动配置到容器，或者扫描配置！
 */
@Controller
public class SpringController {

    @ResponseBody
    @GetMapping("/spring")
    public String spring() {
        return "message return by SpringWeb";
    }
}
