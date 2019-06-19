package com.anwei.box.core.web.controller;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Anwei
 * @TODO: TODO
 * @date 2019/6/19 17:00
 */
public class BaseController {

    @Autowired
    HttpServletRequest request;

}
