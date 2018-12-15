package com.springbootserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**   
 * @Title:  
 * @Description: (类的作用) 
 * @author  liyz 
 * @date  
 */
@SpringBootApplication
@EnableEurekaClient
public class ApplicationRunServer_8003 {
	public static void main(String[] args) {
		SpringApplication.run(ApplicationRunServer_8003.class, args);
	}
}
