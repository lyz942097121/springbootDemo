package com.springboot.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**   
 * @Title:  
 * @Description: (类的作用) 
 * @author  liyz 
 * @date  
 */
@SpringBootApplication
@EnableEurekaServer
public class Springboot_AppEureka7002 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Springboot_AppEureka7002.class, args);
	}

}
