package com.github.peng.spring.boot.security.demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.IOException;

/**
 * Created by fp295 on 2018/3/24.
 * 配置
 */
@Configuration
public class PropertyConfig {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Bean("propertySourceBean")
    public PropertySource propertySourceBean() {

        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        YamlPropertySourceLoader yamlLoader = new YamlPropertySourceLoader();
        PropertySource propertySource = null;

        try {
            propertySource = yamlLoader.load("application",resolver.getResource("classpath:application.yml"), null);
        } catch (IOException e) {
            logger.info("加载 application.yml 配置文件失败");
            e.printStackTrace();
        }

        return propertySource;
    }
}
