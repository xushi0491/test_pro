package com.example.autoconfigure.propeties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author xushi
 * @date 2019-07-14
 * 测试下autoconfigure 打包jar 依赖效果
 */
@ConfigurationProperties(prefix = "auto")
public class AutoProperties {

    private String name = "时哥";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
