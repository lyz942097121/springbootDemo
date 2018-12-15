package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**   
 * @Title:  
 * @Description: (类的作用) 
 * @author  liyz 
 * @date  
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="lyz-springbootDemoApp")
public class Client_App80 {
	public static void main(String[] args) {
		SpringApplication.run(Client_App80.class, args);
	}
}
