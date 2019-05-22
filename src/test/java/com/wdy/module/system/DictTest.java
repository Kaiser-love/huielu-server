package com.wdy.module.system;

import com.wdy.module.base.BaseJunit;
import com.wdy.module.modular.system.mapper.DictMapper;
import com.wdy.module.modular.system.service.DictService;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * 字典服务测试
 *
 * @author fengshuonan
 * @date 2017-04-27 17:05
 */
public class DictTest extends BaseJunit {

    @Resource
    DictService dictService;

    @Resource
    DictMapper dictMapper;

    @Test
    public void deleteTest() {
        this.dictService.delteDict(16L);
    }
}
