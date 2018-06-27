package com.mr5.demo.util.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Config {

    @Value("${app.name}")
    public  String TEST_CONFIG;
}
