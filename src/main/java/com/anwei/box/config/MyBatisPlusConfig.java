package com.anwei.box.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Anwei
 * @TODO: TODO
 * @date 2019/6/19 16:26
 */
@Configuration
@MapperScan("com.anwei.modules.*.mapper")
public class MyBatisPlusConfig {
}
