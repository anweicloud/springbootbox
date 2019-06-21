package com.anwei.box.modules.system.user.service.impl;

import com.anwei.box.core.web.entity.BaseEntity;
import com.anwei.box.core.web.service.IBaseService;
import com.anwei.box.modules.system.user.entity.User;
import com.anwei.box.modules.system.user.mapper.UserMapper;
import com.anwei.box.modules.system.user.service.IUserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Resource
    public UserMapper mapper;

    @Resource
    public IUserService service;

    @Resource
    public IBaseService baseService;

    @Test
    public void testInsert() {
        User user = new User();
        user.setPassword("123");
        user.setRegisterTime(new Date());
        user.setStatus(1);
        user.setTelephone("18288886666");
        user.setUsername("Anwei");
        user.insert();
    }

    @Test
    public void testUpdate() {
        User user = new User();
        user.setPassword("12345");
        user.setUsername("Cloud");
        user.setId(2L);

        Assert.assertEquals(true, user.updateById());
    }

    @Test
    public void testDelete() {
        Assert.assertEquals(1, mapper.deleteById(2L));
    }

    @Test
    public void testFindById() {
        System.out.println(mapper.selectById(2L));
    }


    /**
     * <script>
     * SELECT <choose>
     * <when test="ew != null and ew.sqlSelect != null">
     * ${ew.sqlSelect}
     * </when>
     * <otherwise>id,username,org_id,password,telephone,register_time,status,delete_flag,create_time,update_time</otherwise>
     * </choose> FROM sys_user
     * <where>
     * <choose>
     * <when test="ew != null">
     * <if test="ew.entity != null">
     * <if test="ew.entity.id != null">id=#{ew.entity.id}</if>
     * <if test="ew.entity.username != null"> AND username=#{ew.entity.username}</if>
     * <if test="ew.entity.orgId != null"> AND org_id=#{ew.entity.orgId}</if>
     * <if test="ew.entity.password != null"> AND password=#{ew.entity.password}</if>
     * <if test="ew.entity.telephone != null"> AND telephone=#{ew.entity.telephone}</if>
     * <if test="ew.entity.registerTime != null"> AND register_time=#{ew.entity.registerTime}</if>
     * <if test="ew.entity.status != null"> AND status=#{ew.entity.status}</if>
     * <if test="ew.entity.createTime != null"> AND create_time=#{ew.entity.createTime}</if>
     * <if test="ew.entity.updateTime != null"> AND update_time=#{ew.entity.updateTime}</if>
     * </if>
     *  AND delete_flag=0
     * <if test="ew.sqlSegment != null and ew.sqlSegment != '' and ew.nonEmptyOfNormal">
     * AND ${ew.sqlSegment}
     * </if>
     * <if test="ew.sqlSegment != null and ew.sqlSegment != '' and ew.emptyOfNormal">
     *  ${ew.sqlSegment}
     * </if>
     * </when>
     * <otherwise>delete_flag=0</otherwise>
     * </choose>
     * </where>
     * </script>
     */
    @Test
    public void testQueryWrapper() {

        User user = new User();
        /*
         * 优先使用orgId=2 and username='Anwei' 作为条件，顺序为实体中的属性顺序
         *
         */
        user.setOrgId(2L);
        user.setUsername("Anwei");

        QueryWrapper<User> queryWrapper = new QueryWrapper<>(user);
//        queryWrapper.eq("username", "Anwei");
        queryWrapper.or().like("username", "A");
        queryWrapper.apply("username={0}","Anwei");
        List<User> list = mapper.selectList(queryWrapper);
        list.forEach(System.out::println);
    }


    @Test
    public void testQueryWrapper2() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", "Anwei");
        List<User> list = mapper.selectList(queryWrapper);
        list.forEach(System.out::println);
    }


    /**
     * SELECT * FROM sys_user WHERE org_id=2 AND username='Anwei' AND delete_flag=0
     */
    @Test
    public void testQueryWrapper3() {
        User user = new User();
        user.setOrgId(2L);
        user.setUsername("Anwei");
        QueryWrapper<BaseEntity> queryWrapper = new QueryWrapper<>(user);
        user.selectList(queryWrapper).forEach(System.out::println);
    }

    @Test
    public void testQueryMapper() {
        System.out.println(mapper.mapperTest());
    }

    @Test
    public void testServiceMethod1() {
        System.out.println(service.count());
    }

    @Test
    public void testQuery() {
        System.out.println(baseService.findById(User.class));
    }

}