package com.springweb.controller.scan;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 这个通过包扫描加载到容器里面
 */
@RestController
public class AnnotationController {

    @RequestMapping(value = "/annotation", method = RequestMethod.GET)
    public String annotation() {
        return "return by annotation Controller";
    }
}
