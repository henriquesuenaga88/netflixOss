package com.netflixOss.study;

import com.netflixOss.study.rest.ConsumerControllerClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

@SpringBootApplication
@EnableDiscoveryClient
//@EnableEurekaClient
public class NetflixOssApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(NetflixOssApplication.class, args);
	}
}
