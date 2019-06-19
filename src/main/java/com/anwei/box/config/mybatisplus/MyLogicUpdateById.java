//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.anwei.box.config.mybatisplus;

import com.baomidou.mybatisplus.core.enums.SqlMethod;
import com.baomidou.mybatisplus.core.metadata.TableInfo;
import com.baomidou.mybatisplus.extension.injector.AbstractLogicMethod;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlSource;

public class MyLogicUpdateById extends AbstractLogicMethod {
    public MyLogicUpdateById() {
    }

    public MappedStatement injectMappedStatement(Class<?> mapperClass, Class<?> modelClass, TableInfo tableInfo) {
        boolean logicDelete = tableInfo.isLogicDelete();
        SqlMethod sqlMethod = SqlMethod.UPDATE_BY_ID;
        StringBuilder append = (new StringBuilder("<if test=\"et instanceof java.util.Map\">")).append("<if test=\"et.").append("MP_OPTLOCK_VERSION_ORIGINAL").append("!=null\">").append(" AND ${et.").append("MP_OPTLOCK_VERSION_COLUMN").append("}=#{et.").append("MP_OPTLOCK_VERSION_ORIGINAL").append("}").append("</if></if>");
        /*
        if (logicDelete) {
            append.append(tableInfo.getLogicDeleteSql(true, false));
        }*/

        String sql = String.format(sqlMethod.getSql(), tableInfo.getTableName(), this.sqlSet(logicDelete, false, tableInfo, false, "et", "et."), tableInfo.getKeyColumn(), "et." + tableInfo.getKeyProperty(), append);
        SqlSource sqlSource = this.languageDriver.createSqlSource(this.configuration, sql, modelClass);
        return this.addUpdateMappedStatement(mapperClass, modelClass, sqlMethod.getMethod(), sqlSource);
    }
}
