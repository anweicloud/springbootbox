package com.anwei.box.modules.system.user.entity;

import com.anwei.box.core.web.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author Anwei
 * @since 2019-06-19
 */
@Data
@TableName("sys_user")
public class User extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Long orgId;

    private String username;

    private String password;

    private String telephone;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date registerTime;

    private Integer status;


}
