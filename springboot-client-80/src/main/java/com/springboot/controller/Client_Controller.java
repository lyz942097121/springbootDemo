package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.springboot.dto.PersonDTO;

/**   
 * @Title:  
 * @Description: (类的作用) 
 * @author  liyz 
 * @date  
 */
@RestController
public class Client_Controller {
	//private static final String REST_URL_PREFIX = "http://localhost:8001";
	private static final String REST_URL_PREFIX = "http://LYZ-SPRINGBOOTDEMOAPP";
	@Autowired
	private RestTemplate restTemplate;
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/client/list")
	public List<PersonDTO> find(){
		return restTemplate.getForObject(REST_URL_PREFIX+"/personList", List.class);
	}
}
