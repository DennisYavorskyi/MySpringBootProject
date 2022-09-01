package com.practise.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.practise.proxy", "com.practise.service", "com.practise.repository"})
public class ProjectConfig {



}
