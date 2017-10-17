package com.example.score;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ImportResource;

@MapperScan("com.example.score.dao")
@ImportResource({ "classpath:bytetcc-supports-springcloud.xml" })
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.example.score")
public class ConsumerScoreApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConsumerScoreApplication.class, args);
		//new SpringApplicationBuilder(ConsumerScoreApplication.class).bannerMode(Banner.Mode.OFF).web(true).run(args);
	}
}
