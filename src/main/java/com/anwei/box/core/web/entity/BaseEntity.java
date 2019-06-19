package com.anwei.box.core.web.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Anwei
 * @TODO: TODO
 * @date 2019/6/19 17:02
 */
@Data
public class BaseEntity extends Model<BaseEntity> {

    @TableId
    Long id;

    @TableLogic
    Integer deleteFlag;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(fill = FieldFill.INSERT)
    Date createTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(fill = FieldFill.UPDATE)
    Date updateTime;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
