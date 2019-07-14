package com.example.autoconfigure.service.impl;

import com.example.autoconfigure.service.AutoService;
import org.springframework.stereotype.Component;

/**
 * @author xushi
 * @date 2019-07-14
 * 测试下autoconfigure 打包jar 依赖效果
 */
@Component
public class AutoServiceImpl implements AutoService {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
