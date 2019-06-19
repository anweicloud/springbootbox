package com.anwei.box.modules.system.user.mapper;

import com.anwei.box.modules.system.user.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author Anwei
 * @TODO: TODO
 * @date 2019/6/19 17:58
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

//    @Resource
//    UserMapper userMapper;


    @Test
    public void testName() {
        User user = new User();
        user.setOrgId(2L);
        user.setPassword("123");
        user.setRegisterTime(new Date());
        user.setStatus(1);
        user.setTelephone("18288888888");
        user.setUsername("Anwei");
        user.insert();
        System.out.println(user.getId());
    }

}