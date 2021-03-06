package com.atguigu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//扫描mybatis的基本包
@MapperScan(basePackages="com.atguigu.springcloud.dao")
@EnableEurekaClient//启用Eureka客户端
@EnableDiscoveryClient//服务发现
public class DeptProvider8003_App {

	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8003_App.class, args);
	}
}
