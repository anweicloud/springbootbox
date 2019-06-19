package com.anwei.box.modules.system.user.entity;

import com.anwei.box.core.web.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

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
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("sys_user")
public class User extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Long orgId;

    private String username;

    private String password;

    private String telephone;

    private Date registerTime;

    private Integer status;


}
