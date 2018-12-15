package com.springbootserver.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dto.PersonDTO;
import com.springbootserver.mapper.PersonMapper;
import com.springbootserver.service.PersonService;

/**   
 * @Title:  
 * @Description: (类的作用) 
 * @author  liyz 
 * @date  
 */
@Service
public class PersomServiceImpl implements PersonService{
	
	@Autowired
	private PersonMapper personMapper;

	/* @Description:
	 * @param dto
	 */
	@Override
	public void add(PersonDTO dto) {
		if(dto!=null&&dto.getName()!=null) {
			personMapper.addDTO(dto);
		}
	}

	/* @Description:
	 * @return
	 */
	@Override
	public List<PersonDTO> findAll() {
		return personMapper.findAll();
	}

	/* @Description:
	 * @param dto
	 */
	@Override
	public void delete(PersonDTO dto) {
		if(dto!=null) {
			personMapper.delByid(dto.getId());
		}
	}

}
