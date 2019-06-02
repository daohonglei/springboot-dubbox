package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;


@ImportResource("classpath:dubbo-provider.xml")
@SpringBootApplication
@EnableDubbo
public class SpringbootDubboxApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDubboxApplication.class, args);
	}

}
