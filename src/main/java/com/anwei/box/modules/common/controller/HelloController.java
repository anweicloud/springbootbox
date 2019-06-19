package com.anwei.box.modules.common.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Anwei
 * @TODO: TODO
 * @date 2019/6/19 15:55
 */
@RestController
public class HelloController {

    @RequestMapping("hello")
    public ResponseEntity hello() {
        return ResponseEntity.ok("Hello World1234");
    }

}
