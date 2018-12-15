package com.springbootserver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dto.PersonDTO;
import com.springbootserver.service.PersonService;

/**   
 * @Title:  
 * @Description: (类的作用) 
 * @author  liyz 
 * @date  
 */
@RestController
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@RequestMapping("/personList")
	@ResponseBody
	public List<PersonDTO> find(){
		return personService.findAll();
	}
	
	@RequestMapping("/personAdd")
	public void add(){
		PersonDTO dto =new PersonDTO();
		dto.setName("lihua");
		personService.add(dto);
	}
}
