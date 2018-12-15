package com.springbootserver.service;

import java.util.List;

import com.springboot.dto.PersonDTO;

/**   
 * @Title:  
 * @Description: (类的作用) 
 * @author  liyz 
 * @date  
 */
public interface PersonService {

	public void add(PersonDTO dto);
	public List<PersonDTO> findAll();
	public void delete(PersonDTO dto);
}
