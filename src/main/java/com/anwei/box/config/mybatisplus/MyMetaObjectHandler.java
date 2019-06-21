package com.anwei.box.config.mybatisplus;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 填充器
 *
 * @author nieqiurong 2018-08-10 22:59:23.
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyMetaObjectHandler.class);

    @Override
    public void insertFill(MetaObject metaObject) {
        LOGGER.info("start insert fill ....");
        //避免使用metaObject.setValue()
        if (metaObject.hasSetter("orgId") && metaObject.getValue("orgId") == null) {
            this.setFieldValByName("orgId", 1573, metaObject);
        }

        if (metaObject.hasSetter("createTime")) {
            this.setFieldValByName("createTime", new Date(), metaObject);
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        LOGGER.info("start update fill ....");
        if (metaObject.hasSetter("updateTime")) {
            this.setFieldValByName("updateTime", new Date(), metaObject);
        }
    }

    /**
     * 默认 true
     * 注解实体字段
     *    @TableField(fill = FieldFill.INSERT)
     * @return
     */
    @Override
    public boolean openInsertFill() {
        return true;
    }

    /**
     * 默认 true
     * 注解实体字段
     *    @TableField(fill = FieldFill.UPDATE)
     * @return
     */
    @Override
    public boolean openUpdateFill() {
        return true;
    }
}
