//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.anwei.box.core.web.service.impl;

import com.anwei.box.core.web.service.IBaseService;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import org.springframework.stereotype.Service;

/**
 * @author Anwei
 */
@Service
public class BaseServiceImpl implements IBaseService {

    public <T> T findById(Class<T> cls) {

        try {
            T t = cls.newInstance();
            Model m = (Model) t;
            return (T)m.selectOne(null);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }
}
