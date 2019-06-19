//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.anwei.box.config.mybatisplus;

import com.baomidou.mybatisplus.core.injector.AbstractMethod;
import com.baomidou.mybatisplus.core.injector.AbstractSqlInjector;
import com.baomidou.mybatisplus.core.injector.methods.Insert;
import com.baomidou.mybatisplus.extension.injector.methods.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyLogicSqlInjector extends AbstractSqlInjector {
    public MyLogicSqlInjector() {
    }

    public List<AbstractMethod> getMethodList() {
        return (List) Stream.of(new Insert(),
                new LogicDelete(),
                new LogicDeleteByMap(),
                new LogicDeleteById(),
                new LogicDeleteBatchByIds(),
                new LogicUpdate(),
                new MyLogicUpdateById(),
                new MyLogicSelectById(),
                new LogicSelectBatchByIds(),
                new LogicSelectByMap(),
                new LogicSelectOne(),
                new LogicSelectCount(),
                new LogicSelectMaps(),
                new LogicSelectMapsPage(),
                new LogicSelectObjs(),
                new MyLogicSelectList(),
                new LogicSelectPage()).collect(Collectors.toList());
    }

}
