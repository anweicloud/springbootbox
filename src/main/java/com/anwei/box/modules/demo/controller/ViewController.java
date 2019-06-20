package com.anwei.box.modules.demo.controller;

import com.anwei.box.core.web.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Anwei
 * @TODO: TODO
 * @date 2019/6/20 10:18
 */
@Controller
public class ViewController  extends BaseController {

    @GetMapping("index")
    public String index(Model model) {
        model.addAttribute("title", "Hello JSP");
        model.addAttribute("message", "Hello Springboot 2.x");
        return "index";
    }

}
