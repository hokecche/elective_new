package cn.wisdsoft;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = {"cn.wisdsoft.mapper"})
public class DdmsInterfaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DdmsInterfaceApplication.class, args);
    }

}
