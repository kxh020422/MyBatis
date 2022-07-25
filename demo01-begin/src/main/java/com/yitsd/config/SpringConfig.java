package com.yitsd.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @ClassName SpringConfig
 * @Date 2022/7/20 1:18
 */

@Configuration
@ComponentScan("com.yitsd")
@Import(SqlSessionConfig.class)
public class SpringConfig {
}
