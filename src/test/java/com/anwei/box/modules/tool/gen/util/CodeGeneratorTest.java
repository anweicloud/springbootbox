package com.anwei.box.modules.tool.gen.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Anwei
 * @TODO: TODO
 * @date 2019/6/19 17:11
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CodeGeneratorTest {

    @Test
    public void generatorCode() {

        CodeGenerator.generatorCode( "sys", "sys_user");

    }
}