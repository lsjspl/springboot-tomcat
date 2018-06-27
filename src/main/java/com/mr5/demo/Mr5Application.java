package com.mr5.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//在@mapper上写上注解更加精确，不用使用包定位
//@MapperScan(basePackages = "com.adrich.adbpm", sqlSessionFactoryRef = "sqlSessionFactory")
@EnableTransactionManagement
@EnableScheduling
@SpringBootApplication
public class Mr5Application {

    public static void main(String[] args) {
        SpringApplication.run(Mr5Application.class, args);
    }
}
