package com.springbootserver.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.springboot.dto.PersonDTO;

/**   
 * @Title:  
 * @Description: (类的作用) 
 * @author  liyz 
 * @date  
 */
@Mapper
public interface PersonMapper {
	public List<PersonDTO> findAll();
	public PersonDTO findById (Integer id);
	public  void delByid (Integer id);
	public void addDTO (PersonDTO dto);
	public void updataDTO (PersonDTO dto);
}
